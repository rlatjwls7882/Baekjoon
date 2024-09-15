import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 미로의 크기 N*M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 미로 입력
		int[][] maze = new int[N+1][M+1];
		for(int i=1;i<=N;i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=1;j<=M;j++) {
				maze[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		
		// (N, M)으로 이동할때 가져올 수 있는 최대 사탕의 개수 계산
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=M;j++) {
				maze[i][j] += Math.max(maze[i-1][j], maze[i][j-1]);
			}
		}
		
		bw.write(Integer.toString(maze[N][M]));
		
		bw.close();
	} // end of main()
} // end of Main class