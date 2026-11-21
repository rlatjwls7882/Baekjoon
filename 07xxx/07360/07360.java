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
			int N = Integer.valueOf(br.readLine());
			if(N==0) {
				break;
			}
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			
			int scoreA=0, scoreB=0;
			while(N-->0) {
				int a = Integer.valueOf(st1.nextToken());
				int b = Integer.valueOf(st2.nextToken());
				if(a==1&&b==2) {
					scoreA += 6;
				} else if(a==2&&b==1) {
					scoreB += 6;
				} else if(a-b==1) {
					scoreB += a+b;
				} else if(b-a==1) {
					scoreA += a+b;
				} else if(b>a) {
					scoreB += b;
				} else if(a>b) {
					scoreA += a;
				}
			}
			bw.write(String.format("A has %d points. B has %d points.\n\n", scoreA, scoreB));
		}

		bw.close();
	} // end of main()
} // end of Main class