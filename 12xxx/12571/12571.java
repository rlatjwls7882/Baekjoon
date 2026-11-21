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
		
		int T = Integer.valueOf(br.readLine());
		
		for(int i=1;i<=T;i++) {
			int N = Integer.valueOf(br.readLine());
			
			// 교차점의 개수 계산
			int[][] line = new int[N][2];
			int cnt=0;
			
			for(int j=0;j<N;j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				line[j][0] = Integer.valueOf(st.nextToken());
				line[j][1] = Integer.valueOf(st.nextToken());
				
				for(int k=0;k<j;k++) {
					if(!(line[j][0]<line[k][0]&&line[j][1]<line[k][1]||line[j][0]>line[k][0]&&line[j][1]>line[k][1])) {
						cnt++;
					}
				}
			}
			
			// 출력
			bw.write(String.format("Case #%d: %d\n", i, cnt));
		}
		
		bw.close();
	} // end of main()
} // end of Main class