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
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.valueOf(st.nextToken());
			int m = Integer.valueOf(st.nextToken());
			if(n==0&&m==0) {
				break;
			}
			
			int a=0, b=0;
			double max=Double.MAX_VALUE;
			while(n-->0) {
				st = new StringTokenizer(br.readLine());
				int tmpa = Integer.valueOf(st.nextToken());
				int tmpb = Integer.valueOf(st.nextToken());
				
				if(tmpa<=m&&(tmpb/(double)tmpa<max||tmpb/(double)tmpa==max&&tmpa>a)) {
					max = tmpb/(double)tmpa;
					a=tmpa;
					b=tmpb;
				}
			}
			
			if(max==Double.MAX_VALUE) {
				bw.write("No suitable tickets offered\n");
			} else {
				bw.write("Buy "+a+" tickets for $"+b+"\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class