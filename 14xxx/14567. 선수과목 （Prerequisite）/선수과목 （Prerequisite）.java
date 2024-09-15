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
		
		// 과목의 수 N, 선수 조건의 수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 초기화
		ArrayList<ArrayList<Integer>> edge = new ArrayList<>();
		for(int i=0;i<N;i++) {
			edge.add(new ArrayList<>());
		}
		
		int[] edgeCnt = new int[N];
		
		// 선수과목 조건 입력
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.valueOf(st.nextToken())-1;
			int B = Integer.valueOf(st.nextToken())-1;
			edge.get(A).add(B);
			edgeCnt[B]++;
		}
		
		// 각 과목의 이수할 수 있는 최소 학기 계산
		int[] minSemester = new int[N];
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=0;i<N;i++) {
			if(edgeCnt[i]==0) {
				q.offer(i);
				minSemester[i]=1;
			}
		}
		
		while(!q.isEmpty()) {
			int curNode = q.poll();
			
			for(int nextNode:edge.get(curNode)) {
				edgeCnt[nextNode]--;
				if(edgeCnt[nextNode]==0) {
					q.add(nextNode);
					minSemester[nextNode] = minSemester[curNode]+1;
				}
			}
		}
		
		// 출력
		for(int i=0;i<N;i++) {
			bw.write(Integer.toString(minSemester[i]));
			bw.write(' ');
		}
		
		bw.close();
	} // end of main()
} // end of Main class