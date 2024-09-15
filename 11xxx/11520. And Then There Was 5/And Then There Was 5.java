import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 테스트 케이스 수 N
    	int N = Integer.valueOf(br.readLine());
    	
    	while(N--!=0) {
    		String string = br.readLine();
    		
    		// Q번째 자리, R번째 자리 출력
    		bw.write(string.charAt(string.length()-1)+" 5\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class