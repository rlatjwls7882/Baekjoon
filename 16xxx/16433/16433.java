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
		int R = Integer.valueOf(st.nextToken());
		int C = Integer.valueOf(st.nextToken());
		
		// 주디가 당근을 최대한 많이 심었을떄의 밭의 모양 출력
		if(R%2==C%2) {
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(i%2==j%2) {
						bw.write('v');
					} else {
						bw.write('.');
					}
				}
				bw.newLine();
			}
		} else {
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(i%2!=j%2) {
						bw.write('v');
					} else {
						bw.write('.');
					}
				}
				bw.newLine();
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class