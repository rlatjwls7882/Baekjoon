import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		while(N-->0) {
			int K = Integer.valueOf(br.readLine());
			for(int i=K+1;;i++) {
				if(Integer.toString(i).indexOf('0')==-1) {
					bw.write(i+"\n");
					break;
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class