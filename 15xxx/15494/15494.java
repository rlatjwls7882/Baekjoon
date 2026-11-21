import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		// 7*52X + 21*52K
		int N = Integer.valueOf(br.readLine())/52/7;
		
		for(int X=100;X>0;X--) {
			for(int K=1;;K++) {
				if(X+3*K>N) {
					break;
				}
				if(X+3*K==N) {
					bw.write(X+"\n"+K);
					X=0;
					break;
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class