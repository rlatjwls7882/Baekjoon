import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
	public static void main(String[] args) throws IOException {
		
		int n = Integer.valueOf(br.readLine());
		bw.write(Long.toString(fact(n)));
		
        bw.close();
    } // end of main
	
	public static long fact(int n) {
		if(n<=1) return 1;
		return n*fact(n-1);
	} // end of fact
} // end of Main