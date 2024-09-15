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
		
		// 건물의 종류 N
		int N = Integer.valueOf(br.readLine());
		
		// 초기화
		ArrayList<ArrayList<Integer>> edge = new ArrayList<>();
		for(int i=0;i<N;i++) {
			edge.add(new ArrayList<>());
		}
		
		int[] edgeCnt = new int[N];
		int[] buildTime = new int[N];
		
		// 건물을 짓는데 걸리는 시간과 먼저 지어져야 하는 건물 입력
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			buildTime[i] = Integer.valueOf(st.nextToken());
			
			while(true) {
				int require = Integer.valueOf(st.nextToken())-1;
				if(require==-2) {
					break;
				}
				
				edgeCnt[i]++;
				edge.get(require).add(i);
			}
		}
		
		// 각 건물이 완성되는 최소 시간 계산
		Queue<Integer> q = new LinkedList<>();
		int[] totalTime = new int[N];
		
		for(int i=0;i<N;i++) {
			if(edgeCnt[i]==0) {
				q.offer(i);
				totalTime[i] = buildTime[i];
			}
		}
		
		while(!q.isEmpty()) {
			int curNode = q.poll();
			
			for(int nextNode:edge.get(curNode)) {
				edgeCnt[nextNode]--;
				totalTime[nextNode] = Math.max(totalTime[nextNode], totalTime[curNode]+buildTime[nextNode]);
				if(edgeCnt[nextNode]==0) {
					q.offer(nextNode);
				}
			}
		}
		
		// 출력
		for(int i=0;i<N;i++) {
			bw.write(Integer.toString(totalTime[i]));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class