import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		long[] F = new long[46];
		F[0]=F[1]=1;
		for(int i=2;i<=45;i++) {
			F[i]=F[i-1]+F[i-2];
		}
		
		int n = Integer.valueOf(br.readLine());
		
		while(n-->0) {
			bw.write(F[Integer.valueOf(br.readLine())]+"\n");
		}

		bw.close();
	} // end of main()
} // end of Main class