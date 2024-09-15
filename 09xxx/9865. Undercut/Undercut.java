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
		
		int n = Integer.valueOf(br.readLine());
		for(int i=1;i<=n;i++) {
			int m = Integer.valueOf(br.readLine());
			
			int scoreT=0, scoreD=0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(m>0) {
				if(st.hasMoreTokens()) {
					int a = Integer.valueOf(st.nextToken());
					int b = Integer.valueOf(st.nextToken());
					m--;
					if(a+1==b) {
						if(a==1) {
							scoreT+=6;
						} else {
							scoreT+=a+b;
						}
					} else if(a==b+1) {
						if(b==1) {
							scoreD+=6;
						} else {
							scoreD+=a+b;
						}
					} else if(a>b) {
						scoreT+=a;
					} else if(a<b) {
						scoreD+=b;
					}
				} else {
					st = new StringTokenizer(br.readLine());
				}
			}
			bw.write("Game "+i+": Tessa "+scoreT+" Danny "+scoreD+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class