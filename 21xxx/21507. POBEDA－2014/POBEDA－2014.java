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
        
        // 네 정수 a1 a2 a3 a4 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger a1 = new BigInteger(st.nextToken());
        BigInteger a2 = new BigInteger(st.nextToken());
        BigInteger a3 = new BigInteger(st.nextToken());
        BigInteger a4 = new BigInteger(st.nextToken());
        
        // 만들 수 있는 1*1 크기의 정사각형 개수 계산
        BigInteger rectangle = (a1.compareTo(a2)<0?a1:a2).add(a3.compareTo(a4)<0?a3:a4);
        
        // 만들 수 있는 가장 큰 정사각형의 길이 출력
        bw.write(rectangle.sqrt()+"");
        
        bw.close();
    } // end of main
} // end of Main class