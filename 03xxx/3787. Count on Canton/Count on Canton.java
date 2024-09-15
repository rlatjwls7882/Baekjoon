import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String string = br.readLine();
			if(string==null) break;
			int N = Integer.valueOf(string);
			
			// N번째 유리수 열거 계산
			int step = (int)Math.ceil((Math.sqrt(2*N+1/4.)-1/2.));
			N -= (step-1)*step/2;
			
			if(step%2==1)
				bw.write(String.format("TERM %s IS %d/%d\n", string, step-N+1, N));
			else
				bw.write(String.format("TERM %s IS %d/%d\n", string, N, step-N+1));
		}

		bw.close();
	} // end of main()
} // end of Main class