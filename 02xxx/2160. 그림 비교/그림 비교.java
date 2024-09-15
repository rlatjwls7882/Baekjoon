import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		// N개의 그림 입력
		String[][] picture = new String[N][5];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<5;j++) {
				picture[i][j] = br.readLine();
			}
		}
		
		// 가장 비슷한 두 그림 찾기
		int similar1=1, similar2=2, diff=35;
		
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				
				int cnt=0;
				for(int row=0;row<5;row++) {
					for(int col=0;col<7;col++) {
						if(picture[i][row].charAt(col)!=picture[j][row].charAt(col)) {
							cnt++;
						}
					}
				}
				
				if(cnt<diff) {
					diff=cnt;
					similar1 = i+1;
					similar2 = j+1;
				}
			}
		}
		
		bw.write(String.format("%d %d", similar1, similar2));
		
		bw.close();
	} // end of main()
} // end of Main class