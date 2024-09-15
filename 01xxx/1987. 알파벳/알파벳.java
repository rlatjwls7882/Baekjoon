import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] moveX = {1, -1, 0, 0};
	static int[] moveY = {0, 0, 1, -1};
	static boolean[] alpha = new boolean[26];
	static int R, C, maxSize;
	static int[][] board;
	
	public static void main(String[] args) throws IOException {

		// 보드의 크기 R*C
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.valueOf(st.nextToken());
		C = Integer.valueOf(st.nextToken());
		
		// 보드 입력
		board = new int[R][C];
		for(int i=0;i<R;i++) {
			String string = br.readLine();
			for(int j=0;j<C;j++) {
				board[i][j] = string.charAt(j)-'A';
			}
		}
		
		// 말이 지날 수 있는 최대의 칸 수 계산
		dfs(0, 0, 1);
		bw.write(Integer.toString(maxSize));
		
		bw.close();
	} // end of main()
	
	static void dfs(int x, int y, int depth) {
		alpha[board[x][y]]=true;
		
		if(maxSize<depth) {
			maxSize=depth;
		}
		
		for(int i=0;i<4;i++) {
			int nextX = x+moveX[i];
			int nextY = y+moveY[i];

			if(nextX<0||nextX>=R||nextY<0||nextY>=C||alpha[board[nextX][nextY]]) {
				continue;
			} else {
				dfs(nextX, nextY, depth+1);
				alpha[board[nextX][nextY]]=false;
			}
		}
		
	} // end of dfs()
} // end of Main class