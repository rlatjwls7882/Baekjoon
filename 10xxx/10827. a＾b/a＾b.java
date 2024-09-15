import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 소수 a, 정수 b 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	BigDecimal a = new BigDecimal(st.nextToken());
    	int b = Integer.valueOf(st.nextToken());
    	
    	// a^b 출력
    	bw.write(a.pow(b).toPlainString()+"");
    	bw.close();
    } // end of main
} // end of Main class