import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// A,B 입력
    	StringTokenizer st = new StringTokenizer(bf.readLine());
    	BigInteger A = new BigInteger(st.nextToken());
    	BigInteger B = new BigInteger(st.nextToken());
    	
    	// 몫과 나머지 출력
    	bw.write(A.divide(B)+"\n"+A.remainder(B));
    	
    	bw.close();
    } // end of main
} // end of Main class