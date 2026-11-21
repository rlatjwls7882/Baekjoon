import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 테스트케이스의 수 t 입력
        int t = Integer.valueOf(br.readLine());
        
        while(t--!=0) {
        	
        	// a, b를 입력하여 a+b가 아닌 값 출력
        	String aAndb = br.readLine();
        	
        	bw.write(aAndb.charAt(0)+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class