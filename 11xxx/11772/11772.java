import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// P의 개수 N 입력
    	int N = Integer.valueOf(br.readLine());
    	
    	// P1 ~ PN의 합 계산
    	int sum=0;
    	
    	for(int i=1;i<=N;i++) {
    		int P = Integer.valueOf(br.readLine());
    		sum += Math.pow(P/10, P%10);
    	}
    	
    	// Pi ~ PN의 합 출력
    	bw.write(sum+"");
    	bw.close();
    } // end of main
} // end of Main class