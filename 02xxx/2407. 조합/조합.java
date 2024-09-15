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
        
        // n, m 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int m = Integer.valueOf(st.nextToken());
        
        // nCm 계산
        BigInteger sum = BigInteger.ONE;
        
        // ex) ₄C₃ -> ₄C₁
        if(m<n-m) m=n-m;

        // nCm -> (n)(n-1)(n-2)...(n-m)
        for(int i=0;i<m;i++)
        	sum = sum.multiply(new BigInteger(n-i+""));

        // nCm -> / (m)(m-1)(m-2)...(2)(1)
        for(int i=2;i<=m;i++)
        	sum = sum.divide(new BigInteger(i+""));

        // nCm 출력
        bw.write(sum+"");
        bw.close();
    } // end of main
} // end of Main class