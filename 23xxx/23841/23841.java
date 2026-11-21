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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 데칼코마니 생성
		char[][] picture = new char[N][M];
		for(int i=0;i<N;i++) {
			String string = br.readLine();
			for(int j=0;j<M;j++) {
				if(string.charAt(j)!='.') {
					picture[i][j]=picture[i][M-1-j]=string.charAt(j);
				}
			}
		}
		
		// 출력
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(picture[i][j]==0) {
					bw.write('.');
				} else {
					bw.write(picture[i][j]);
				}
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class