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
		
		int N = Integer.valueOf(br.readLine());
		
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine(),":");
			int[][] hms = new int[3][6];
			
			// 시 분 초를 이진법으로 변환
			for(int i=0;i<3;i++) {
				int time = Integer.valueOf(st.nextToken());
				
				for(int j=0;time!=0;j++) {
					hms[i][5-j]=time%2;
					time/=2;
				}
			}
			
			// 3열 방식으로 읽은 이진법 시계의 시각
			for(int i=0;i<6;i++) {
				for(int j=0;j<3;j++) {
					bw.write(Integer.toString(hms[j][i]));
				}
			}
			bw.write(' ');
			
			// 3행 방식으로 읽은 이진법 시계의 시각
			for(int i=0;i<3;i++) {
				for(int j=0;j<6;j++) {
					bw.write(Integer.toString(hms[i][j]));
				}
			}
			
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class