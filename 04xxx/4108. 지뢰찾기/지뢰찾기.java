import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] nextX = {-1, 0, 1, -1, 1, -1, 0, 1};
	static int[] nextY = {1, 1, 1, 0, 0, -1, -1, -1};
	
	public static void main(String[] args) throws IOException {
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int R = Integer.valueOf(st.nextToken());
			int C = Integer.valueOf(st.nextToken());
			
			if(R==0&&C==0) {
				break;
			}
			
			// 맵 입력
			char[][] map = new char[R][C];
			for(int i=0;i<R;i++) {
				map[i] = br.readLine().toCharArray();
			}
			
			// 인접한 칸의 지뢰의 수 출력
			for(int i=0;i<R;i++) {
				for(int j=0;j<C;j++) {
					if(map[i][j]=='*') {
						bw.write('*');
					} else {
						int cnt=0;
						for(int k=0;k<8;k++) {
							int x = i+nextX[k];
							int y = j+nextY[k];
							if(x<0||x>=R||y<0||y>=C) {
								continue;
							}
							if(map[x][y]=='*') {
								cnt++;
							}
						}
						
						bw.write(Integer.toString(cnt));
					}
				}
				bw.newLine();
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class