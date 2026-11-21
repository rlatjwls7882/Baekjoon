import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static int N, M, K, max=Integer.MIN_VALUE, sum;
	static int[] moveX = {1, -1, 0, 0};
	static int[] moveY = {0, 0, 1, -1};
	static int[][] map;
	static boolean[][] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 격자판의 크기 N*M, 뽑을 개수 K
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());
		K = Integer.valueOf(st.nextToken());
		
		// 격자판 입력
		map = new int[N][M];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++)
				map[i][j] = Integer.valueOf(st.nextToken());
		}
		
		// K개 수를 고른 합의 최댓값 계산
		visited = new boolean[N][M];
		dfs(0);
		
		bw.write(max+"");
		
		bw.close();
	} // end of main()
	
	static void dfs(int depth) {
		
		if(depth==K) {
			if(max<sum) max=sum;
			return;
		}
		
		for(int i=0;i<N;i++)
			for(int j=0;j<M;j++)
				if(!visited[i][j]) {
					
					// 해당 칸을 선택할 수 있는지 확인
					boolean canSelect=true;
					
					for(int k=0;k<4;k++) {
						int closeX = i+moveX[k];
						int closeY = j+moveY[k];
						
						if(closeX>=0&&closeX<N&&closeY>=0&&closeY<M&&visited[closeX][closeY]) {
							canSelect=false;
							break;
						}
					}
					
					// 선택 가능한 경우
					if(canSelect) {
						visited[i][j]=true;
						sum += map[i][j];
						dfs(depth+1);
						sum -= map[i][j];
						visited[i][j]=false;
					}
				}
		
	} // end of dfs()
} // end of Main class