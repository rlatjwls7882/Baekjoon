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
		
		// 축구 팀 수 n, 경기의 승패 수 m
		int n = Integer.valueOf(br.readLine());
		int m = Integer.valueOf(br.readLine());
		
		// 초기화
		ArrayList<ArrayList<Integer>> edge = new ArrayList<>();
		for(int i=0;i<n;i++) {
			edge.add(new ArrayList<>());
		}
		int[] edgeCnt = new int[n];
		
		// 경기의 결과 입력
		while(m-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int i = Integer.valueOf(st.nextToken())-1;
			int j = Integer.valueOf(st.nextToken())-1;
			
			edge.get(i).add(j);
			edgeCnt[j]++;
		}
		
		// 각 팀의 순위 계산
		Queue<Integer> q = new LinkedList<>();
		for(int i=0;i<n;i++) {
			if(edgeCnt[i]==0) {
				q.offer(i);
			}
		}
		
		boolean moreCase = false;
		while(!q.isEmpty()) {
			int curNode = q.poll();
			
			for(int nextNode:edge.get(curNode)) {
				edgeCnt[nextNode]--;
				if(edgeCnt[nextNode]==0) {
					q.offer(nextNode);
				}
			}
			
			if(q.size()>1) {
				moreCase=true;
			}
			
			bw.write(Integer.toString(curNode+1));
			bw.newLine();
		}
		
		// 유일한 순위표인지 확인
		if(moreCase) {
			bw.write("1");
		} else {
			bw.write("0");
		}
		
		bw.close();
	} // end of main()
} // end of Main class