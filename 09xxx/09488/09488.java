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
			long n = Integer.valueOf(br.readLine());
			if(n==0) {
				break;
			}
			
			// ∑(i*(n-i+1))
			// = ∑((n+1)i-i^2)
			long sum = n*(n+1)*(n+1)/2-n*(n+1)*(2*n+1)/6;
			bw.write(sum+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class