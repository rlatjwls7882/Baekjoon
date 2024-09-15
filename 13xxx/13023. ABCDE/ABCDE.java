import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static ArrayList<ArrayList<Integer>> connect = new ArrayList<>();
	static boolean isExist=false;
	static boolean[] visited;
	static int N;
	
	public static void main(String[] args) throws IOException {
		
		// 사람의 수 N, 친구 관계의 수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 초기화
		visited = new boolean[N];
		for(int i=0;i<N;i++) {
			connect.add(new ArrayList<>());
		}
		
		// 친구 관계 입력
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken());
			int b = Integer.valueOf(st.nextToken());
			
			connect.get(a).add(b);
			connect.get(b).add(a);
		}
		
		// A-B-C-D-E 로 친구인 관계가 존재하는지 확인
		for(int i=0;i<N&&!isExist;i++) {
			dfs(i, 1);
		}
		
		if(isExist) {
			bw.write("1");
		} else {
			bw.write("0");
		}
		
		bw.close();
	} // end of main()
	
	static void dfs(int start, int depth) {
		
		if(depth==5) {
			isExist=true;
			return;
		}
		
		visited[start]=true;

		for(int route:connect.get(start)) {
			if(isExist) {
				return;
			} else if(!visited[route]) {
				visited[route]=true;
				dfs(route, depth+1);
				visited[route]=false;
			}
		}

		visited[start]=false;
		
	} // end of dfs()
} // end of Main class