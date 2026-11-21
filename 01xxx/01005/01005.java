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
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			
			// 건물의 수 N, 건설 순서 규칙의 수 K
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.valueOf(st.nextToken());
			int K = Integer.valueOf(st.nextToken());
			
			// 초기화
			ArrayList<ArrayList<Integer>> edge = new ArrayList<>();
			for(int i=0;i<N;i++) {
				edge.add(new ArrayList<>());
			}
			
			int[] edgeCnt = new int[N];
			
			// 각 건물의 건설 시간
			st = new StringTokenizer(br.readLine());
			int[] D = new int[N];
			for(int i=0;i<N;i++) {
				D[i] = Integer.valueOf(st.nextToken());
			}
			
			// 건설순서
			while(K-->0) {
				st = new StringTokenizer(br.readLine());
				int X = Integer.valueOf(st.nextToken())-1;
				int Y = Integer.valueOf(st.nextToken())-1;
				edge.get(X).add(Y);
				edgeCnt[Y]++;
			}
			
			// W건물을 건설완료하는데 드는 최소 시간 계산
			int W = Integer.valueOf(br.readLine())-1;
			int[] time = new int[N];
			
			Queue<Integer> q = new LinkedList<>();
			for(int i=0;i<N;i++) {
				if(edgeCnt[i]==0) {
					q.offer(i);
					time[i] = D[i];
				}
			}
			
			while(!q.isEmpty()) {
				int curNode = q.poll();
				
				if(curNode==W) {
					break;
				}
				
				for(int nextNode:edge.get(curNode)) {
					edgeCnt[nextNode]--;
					time[nextNode] = Math.max(time[nextNode], time[curNode]+D[nextNode]);
					if(edgeCnt[nextNode]==0) {
						q.offer(nextNode);
					}
				}
			}
			
			// 출력
			bw.write(Integer.toString(time[W]));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class