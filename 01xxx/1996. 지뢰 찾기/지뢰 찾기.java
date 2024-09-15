import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] x = {-1, 0, 1, -1, 1, -1 ,0, 1};
	static int[] y = {-1, -1, -1, 0, 0, 1, 1, 1};
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		// map 생성
		char[][] map = new char[N][N];
		for(int i=0;i<N;i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		// 완성된 map 출력
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(map[i][j]!='.') {
					bw.write('*');
				} else {
					int cnt=0;
					for(int k=0;k<8;k++) {
						int nextX = i-x[k];
						int nextY = j-y[k];
						
						if(nextX<0||nextX>=N||nextY<0||nextY>=N) {
							continue;
						}
						cnt += Math.max(0, map[nextX][nextY]-'0');
					}

					if(cnt>=10) {
						bw.write('M');
					} else {
						bw.write(Integer.toString(cnt));
					}
				}
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class