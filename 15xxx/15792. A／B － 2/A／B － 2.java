import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 두 정수 A, B 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	BigDecimal A = new BigDecimal(st.nextToken());
    	BigDecimal B = new BigDecimal(st.nextToken());
    	
    	// A/B를 소수점 1000자리까지 출력
    	bw.write(A.divide(B,1000,RoundingMode.HALF_UP)+"");
    	bw.close();
    } // end of main
} // end of Main class