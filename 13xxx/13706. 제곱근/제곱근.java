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
        
        // 정수 N 입력
        BigInteger N = new BigInteger(br.readLine());
        
        // 정수 N의 제곱근 출력
        bw.write(N.sqrt()+"");
        bw.close();
    } // end of main
} // end of Main class