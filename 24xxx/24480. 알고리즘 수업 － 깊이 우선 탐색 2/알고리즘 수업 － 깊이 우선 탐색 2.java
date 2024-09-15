import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	static int[] visited;
	static ArrayList<PriorityQueue<Integer>> road = new ArrayList<>();
	static int visitNum=1;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 정점의 수 N, 간선의 수 M, 시작지점 R
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		int R = Integer.valueOf(st.nextToken())-1;

		// 방문 순서와 간선 목록 생성
		visited = new int[N];

		for(int i=0;i<N;i++)
			road.add(new PriorityQueue<Integer>(Collections.reverseOrder()));
		
		// M개의 간선 입력
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken())-1;
			int b = Integer.valueOf(st.nextToken())-1;

			road.get(a).add(b);
			road.get(b).add(a);
		}
		
		// dfs 수행 결과 출력
		dfs(R);
		
		for(int i=0;i<N;i++)
			System.out.println(visited[i]);
		
	} // end of main
	
	public static void dfs(int i) {
		
		// 방문기록
		visited[i]=visitNum++;
		
		// 이 길의 다음 노드 이동
		while(!road.get(i).isEmpty()) {
			int go = road.get(i).poll();

			if(visited[go]==0)
				dfs(go);
		}
		
	} // end of dfs
} // end of Main class