import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 테스트 케이스의 수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        while(T--!=0) {
        	
        	// 나눠야 하는 수와 나누는 수 입력
        	BigInteger dividend = new BigInteger(br.readLine());
        	BigInteger divisor = new BigInteger(br.readLine());
        	
        	// 몫과 나머지 출력
        	BigInteger[] quotientAndRemainder = dividend.divideAndRemainder(divisor);
        	
        	bw.write(quotientAndRemainder[0]+"\n"
        	+quotientAndRemainder[1]+"\n\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class