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
	static ArrayList<ArrayList<Integer>> link = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		
		// 학생 수 N, 키를 비교한 횟수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 초기화
		for(int i=0;i<N;i++) {
			link.add(new ArrayList<>());
		}
		
		int[] edgeCnt = new int[N];
		
		// 비교 입력
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.valueOf(st.nextToken())-1;
			int B = Integer.valueOf(st.nextToken())-1;
			link.get(A).add(B);
			edgeCnt[B]++;
		}
		
		// 줄 세우기
		Queue<Integer> q = new LinkedList<>();
		for(int i=0;i<N;i++) {
			if(edgeCnt[i]==0) {
				q.offer(i);
			}
		}
		
		while(!q.isEmpty()) {
			int curNode = q.poll();
			
			if(edgeCnt[curNode]==0) {
				bw.write(Integer.toString(curNode+1));
				bw.write(' ');
			}
			
			for(int nextNode:link.get(curNode)) {
				edgeCnt[nextNode]--;
				if(edgeCnt[nextNode]==0) {
					q.offer(nextNode);
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class