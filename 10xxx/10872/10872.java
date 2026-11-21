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
    	int N = Integer.valueOf(br.readLine());
    	
    	// N! 계산
    	int facN=1;
    	
    	for(int i=2;i<=N;i++)
    		facN*=i;
    	
    	// N! 출력
    	bw.write(facN+"");
    	bw.close();
    } // end of main
} // end of Main class