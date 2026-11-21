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
		
		// 아스키 아트로 변환하여 출력
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				int R = Integer.valueOf(st.nextToken());
				int G = Integer.valueOf(st.nextToken());
				int B = Integer.valueOf(st.nextToken());
				int intensity = 2126*R+7152*G+722*B;
				
				if(intensity<510_000) {
					bw.write('#');
				} else if(intensity<1_020_000) {
					bw.write('o');
				} else if(intensity<1_530_000) {
					bw.write('+');
				} else if(intensity<2_040_000) {
					bw.write('-');
				} else {
					bw.write('.');
				}
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class