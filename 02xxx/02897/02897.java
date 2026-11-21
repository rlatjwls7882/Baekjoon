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
		int R = Integer.valueOf(st.nextToken());
		int C = Integer.valueOf(st.nextToken());
		
		// 주차장의 지도
		char[][] map = new char[R][];
		for(int i=0;i<R;i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		// 차를 댈 수 있는 장소의 수 계산
		int[] space = new int[5];
		for(int i=0;i<R-1;i++) {
			for(int j=0;j<C-1;j++) {
				if(map[i][j]=='#'||map[i][j+1]=='#'||map[i+1][j]=='#'||map[i+1][j+1]=='#') {
					continue;
				}
				
				int cnt=0;
				if(map[i][j]=='X') {
					cnt++;
				}
				if(map[i+1][j]=='X') {
					cnt++;
				}
				if(map[i][j+1]=='X') {
					cnt++;
				}
				if(map[i+1][j+1]=='X') {
					cnt++;
				}
				
				space[cnt]++;
			}
		}
		
		// 출력
		for(int i=0;i<5;i++) {
			bw.write(Integer.toString(space[i]));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class