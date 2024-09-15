import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// A 입력
    	int N = Integer.valueOf(br.readLine());
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	BigInteger A = BigInteger.ONE;
    	while(N-->0)
    		A = A.multiply(new BigInteger(st.nextToken()));
    	
    	// B 입력
    	int M = Integer.valueOf(br.readLine());
    	st = new StringTokenizer(br.readLine());
    	
    	BigInteger B = BigInteger.ONE;
    	while(M-->0)
    		B = B.multiply(new BigInteger(st.nextToken()));
    	
    	// A와 B의 최대공약수 계산
    	String gcd = A.gcd(B).toString();
    	bw.write(gcd.length()>9?gcd.substring(gcd.length()-9, gcd.length()):gcd);
    	
    	bw.close();
    } // end of main
} // end of Main class