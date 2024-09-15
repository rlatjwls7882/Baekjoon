import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 문제의 수 N, 정보의 개수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 초기화
		ArrayList<ArrayList<Integer>> edge = new ArrayList<>();
		for(int i=0;i<N;i++) {
			edge.add(new ArrayList<>());
		}
		
		int[] edgeCnt = new int[N];
		
		// 정보 입력
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.valueOf(st.nextToken())-1;
			int B = Integer.valueOf(st.nextToken())-1;
			edge.get(A).add(B);
			edgeCnt[B]++;
		}
		
		// 민오가 푸는 문제의 순서 계산
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<N;i++) {
			if(edgeCnt[i]==0) {
				pq.offer(i);
			}
		}
		
		while(!pq.isEmpty()) {
			int curNode = pq.poll();
			
			bw.write(Integer.toString(curNode+1));
			bw.write(' ');
			
			for(int nextNode:edge.get(curNode)) {
				edgeCnt[nextNode]--;
				if(edgeCnt[nextNode]==0) {
					pq.offer(nextNode);
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class