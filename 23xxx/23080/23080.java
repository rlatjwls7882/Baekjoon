import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 막대의 굵기 K, 암호문 S 입력
    	int K = Integer.valueOf(br.readLine());
    	String code = br.readLine();
    	
    	// 암호문을 해독한 결과 출력
    	for(int i=0;i<code.length();i+=K)
    		bw.write(code.charAt(i));
    	
    	bw.close();
    } // end of main
} // end of Main class