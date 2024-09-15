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
		
		// 작업의 수 N
		int N = Integer.valueOf(br.readLine());
		
		// 초기화
		ArrayList<ArrayList<Integer>> edge = new ArrayList<>();
		for(int i=0;i<N;i++) {
			edge.add(new ArrayList<>());
		}
		
		int[] edgeCnt = new int[N];
		int[] time = new int[N];
		
		// 각 작업의 선행 작업 입력
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			time[i] = Integer.valueOf(st.nextToken());
			int num = Integer.valueOf(st.nextToken());
			
			while(num-->0) {
				int require = Integer.valueOf(st.nextToken())-1;
				edge.get(i).add(require);
				edgeCnt[require]++;
			}
		}
		
		// 모든 작업을 완료하기 위한 최소시간 계산
		Queue<Integer> q = new LinkedList<>();
		int[] totalTime = new int[N];
		int minTime=0;
		
		for(int i=0;i<N;i++) {
			if(edgeCnt[i]==0) {
				q.offer(i);
				minTime = Math.max(minTime, time[i]);
				totalTime[i]=time[i];
			}
		}
		
		while(!q.isEmpty()) {
			int curNode = q.poll();
			
			for(int nextNode:edge.get(curNode)) {
				edgeCnt[nextNode]--;
				totalTime[nextNode] = Math.max(totalTime[curNode]+time[nextNode], totalTime[nextNode]);
				
				if(edgeCnt[nextNode]==0) {
					q.offer(nextNode);
					minTime = Math.max(minTime, totalTime[nextNode]);
				}
			}
		}
		bw.write(Integer.toString(minTime));
		
		bw.close();
	} // end of main()
} // end of Main class