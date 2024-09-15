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
        
        // 두 정수 입력
        BigInteger A = new BigInteger(br.readLine());
        String B = br.readLine();
        
        // 곱하는 두 수
        bw.write(A+"\n"+B+"\n");
        
        // 중간 과정
        for(int i=B.length()-1;i>=0;i--)
        	bw.write(A.multiply(BigInteger.valueOf(B.charAt(i)-'0'))+"\n");
        
        // 곱한 결과
        bw.write(A.multiply(new BigInteger(B))+"");
        bw.close();
    } // end of main
} // end of Main class