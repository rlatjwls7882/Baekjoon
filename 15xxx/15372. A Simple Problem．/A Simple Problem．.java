import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.valueOf(bf.readLine());
		
		while(T-->0) {
			long N = Long.valueOf(bf.readLine());
			
			bw.write(N*N+"\n");
		} // end of while
		
		bw.close();
	} // end of main
} // end of main class