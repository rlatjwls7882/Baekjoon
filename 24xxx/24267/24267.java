import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// N 입력
    	long N = Integer.valueOf(br.readLine());
    	
    	// 코드1이 실행되는 횟수 계산 (nC₃)
    	long num = N*(N-1)*(N-2)/6;
    	
    	// 실행된 횟수와 시간복잡도 출력
    	bw.write(num+"\n3");
    	bw.close();
    } // end of main
} // end of Main class