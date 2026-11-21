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
			StringTokenizer st = new StringTokenizer(br.readLine());
			int R = Integer.valueOf(st.nextToken());
			int C = Integer.valueOf(st.nextToken());
			
			bw.write("Case #"+i+":\n");
			
			for(int j=0;j<=R*2;j++) {
				for(int k=0;k<=C*2;k++) {
					if(j<2&&k<2) {
						bw.write('.');
					} else if(j%2==0&&k%2==0) {
						bw.write('+');
					} else if(j%2==0) {
						bw.write('-');
					} else if(j%2==1&&k%2==0) {
						bw.write('|');
					} else if(j%2==1) {
						bw.write('.');
					}
				}
				bw.newLine();
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class