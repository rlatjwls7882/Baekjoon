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
        
        // 단계 수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // (1*5-3) + (2*5-5) + ... + ((N-1)*5-(2(N-1)+1)) + N*5
        // => 3(N-1)N/2 - (N-1) + 5N
        // => (3N+2)(N+1)/2
        
        // N단계의 점의 개수 % 45678 출력
        bw.write(new BigInteger(String.valueOf(N*3+2))
        		.multiply(new BigInteger(String.valueOf(N+1)))
        		.divide(BigInteger.TWO)
        		.remainder(new BigInteger("45678"))+"");
        bw.close();
    } // end of main
} // end of Main class