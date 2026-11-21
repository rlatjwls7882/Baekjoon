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
    	
    	while(true) {
    		
    		// 최대 2^31 두 정수 입력
    		StringTokenizer st = new StringTokenizer(bf.readLine());
    		BigInteger a = new BigInteger(st.nextToken());
    		BigInteger b = new BigInteger(st.nextToken());
    		
    		// 0 0이 입력될 경우 종료
    		if(a.equals(BigInteger.ZERO)&&b.equals(BigInteger.ZERO)) break;
    		
    		// 대분수 출력
    		bw.write(a.divide(b)+" ");
    		bw.write(a.remainder(b)+" / "+b+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class