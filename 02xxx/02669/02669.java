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
		
		// 네 직사각형이 차지하는 넓이 계산
		int size=101;
		boolean[][] map = new boolean[size][size];
		
		for(int i=0;i<4;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.valueOf(st.nextToken());
			int y1 = Integer.valueOf(st.nextToken());
			int x2 = Integer.valueOf(st.nextToken());
			int y2 = Integer.valueOf(st.nextToken());
			for(int x=x1;x<x2;x++) {
				for(int y=y1;y<y2;y++) {
					map[x][y]=true;
				}
			}
		}
		
		int cnt=0;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(map[i][j]) {
					cnt++;
				}
			}
		}
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class