import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		while(true) {
			String string = br.readLine();
			if(string.equals("#")) {
				break;
			}
			
			int Y=0, N=0, A=0;
			for(int i=0;i<string.length();i++) {
				if(string.charAt(i)=='Y') {
					Y++;
				} else if(string.charAt(i)=='N') {
					N++;
				} else if(string.charAt(i)=='A') {
					A++;
				}
			}
			
			if(A*2>=string.length()) {
				bw.write("need quorum\n");
			} else if(Y>N) {
				bw.write("yes\n");
			} else if(Y<N) {
				bw.write("no\n");
			} else {
				bw.write("tie\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class