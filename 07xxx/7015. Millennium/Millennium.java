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
			StringTokenizer st = new StringTokenizer(br.readLine());
			int Y = Integer.valueOf(st.nextToken());
			int M = Integer.valueOf(st.nextToken());
			int D = Integer.valueOf(st.nextToken());
			
			int day=0;
			while(true) {
				if(Y==1000&&M==1) {
					break;
				}
				if(M%2==1||Y%3==0) {
					day += 21-D;
					D=1;
				} else {
					day += 20-D;
					D=1;
				}
				M++;
				if(M==11) {
					M=1;
					Y++;
				}
			}
			bw.write(day+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class