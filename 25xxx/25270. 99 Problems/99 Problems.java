import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 정수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 정수가 두자리수인 경우
        if(N<100)
        	bw.write("99");
        
        // 정수가 세자리수 이상인 경우
        else {
        	
        	int bigN = N - N%100 + 99;
        	int smallN = N - N%100 - 1;
        	
        	if(N-smallN<bigN-N)
        		bw.write(smallN+"");
            
        	else
        		bw.write(bigN+"");
        }
        
        bw.close();
    } // end of main
} // end of Main class