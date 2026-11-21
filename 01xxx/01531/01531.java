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
		
		// N개의 불투명 종이로 그림 가리기
		int[][] picture = new int[100][100];
		while(N-->0) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.valueOf(st.nextToken())-1;
			int y1 = Integer.valueOf(st.nextToken())-1;
			int x2 = Integer.valueOf(st.nextToken())-1;
			int y2 = Integer.valueOf(st.nextToken())-1;
			
			for(int x=x1;x<=x2;x++) {
				for(int y=y1;y<=y2;y++) {
					picture[x][y]++;
				}
			}
		}
		
		// 보이지 않는 그림의 개수 계산
		int cnt=0;
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(picture[i][j]>M) {
					cnt++;
				}
			}
		}
		
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class