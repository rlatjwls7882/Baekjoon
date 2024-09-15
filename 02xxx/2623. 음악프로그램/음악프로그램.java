import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 가수의 수 N, 보조 PD의 수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 초기화
		ArrayList<ArrayList<Integer>> edge = new ArrayList<>();
		for(int i=0;i<N;i++) {
			edge.add(new ArrayList<>());
		}
		int[] edgeCnt = new int[N];
		
		// 각 PD가 정한 가수의 순서 입력
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int singerNum = Integer.valueOf(st.nextToken());
			
			int lastSinger=0;
			for(int i=0;i<singerNum;i++) {
				int curSinger = Integer.valueOf(st.nextToken())-1;
				
				if(i>=1) {
					edge.get(lastSinger).add(curSinger);
					edgeCnt[curSinger]++;
				}
				lastSinger = curSinger;
			}
		}
		
		// 전체 가수의 순서 계산
		Queue<Integer> q = new LinkedList<>();
		for(int i=0;i<N;i++) {
			if(edgeCnt[i]==0) {
				q.offer(i);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(!q.isEmpty()) {
			int curNode = q.poll();
			
			for(int nextNode:edge.get(curNode)) {
				edgeCnt[nextNode]--;
				if(edgeCnt[nextNode]==0) {
					q.offer(nextNode);
				}
			}
			sb.append(curNode+1).append('\n');
		}
		
		// 출력
		if(isCycle(edgeCnt, N)) {
			bw.write("0");
		} else {
			bw.write(sb.toString());
		}
		
		bw.close();
	} // end of main()
	
	static boolean isCycle(int[] edgeCnt, int N) {
		for(int i=0;i<N;i++) {
			if(edgeCnt[i]!=0) {
				return true;
			}
		}
		return false;
	} // end of isCycle()
} // end of Main class