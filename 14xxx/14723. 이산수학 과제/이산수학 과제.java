import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.valueOf(br.readLine());
		
		// N번째 유리수 계산
		int step = (int)Math.ceil((Math.sqrt(2*N+1/4.)-1/2.));
		N -= (step-1)*step/2;
		
		bw.write((step-N+1)+" "+N);

		bw.close();
	} // end of main()
} // end of Main class