import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
    	
    	int n = Integer.valueOf(br.readLine());
    	bw.write(BigInteger.TWO.pow(n).subtract(BigInteger.ONE)+"\n");
    	if(n<=20) rec(n, 1, 3, 2);
    	
        bw.close();
    } // end of main
    
    static void rec(int n, int from, int to, int another) throws IOException {
    	if(n==1) {
    		bw.write(from+" "+to+"\n");
    		return;
    	}
    	rec(n-1, from, another, to);
    	bw.write(from+" "+to+"\n");
    	rec(n-1, another, to, from);
    } // end of rec
} // end of Main class