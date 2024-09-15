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
			int A = Integer.valueOf(st.nextToken())*10+Integer.valueOf(st.nextToken());
			int B = Integer.valueOf(st.nextToken())*10+Integer.valueOf(st.nextToken());
			if(A==0) {
				break;
			}
			A = Math.max(A, A/10+A%10*10);
			B = Math.max(B, B/10+B%10*10);
			
			int winner=0;
			if(A==21&&B!=21) {
					winner=1;
			} else if(B==21&&A!=21) {
					winner=2;
			} else if(A%10==A/10&&(B%10!=B/10||A>B)) {
					winner=1;
			} else if(B%10==B/10&&(A%10!=A/10||B>A)) {
					winner=2;
			} else if(A>B) {
				winner=1;
			} else if(B>A) {
				winner=2;
			}
			
			if(winner==0) {
				bw.write("Tie.\n");
			} else {
				bw.write("Player "+winner+" wins.\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class