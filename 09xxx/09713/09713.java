import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 테스트 케이스 수
    	int T = Integer.valueOf(bf.readLine());
    	
    	while(T--!=0) {
    		// 홀수 N
    		int N = Integer.valueOf(bf.readLine());
    		
    		// 1~N 사이의 홀수합 oddSum 계산
    		int oddSum=0;
    		for(int i=1;i<=N;i+=2)
    			oddSum+=i;
    		
    		// oddSum 출력
    		bw.write(oddSum+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class