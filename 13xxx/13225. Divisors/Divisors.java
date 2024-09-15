import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 테스트 케이스의 수 T 입력
    	int T = Integer.valueOf(br.readLine());
    	
    	while(T--!=0) {
    		int n = Integer.valueOf(br.readLine());
    		
    		// n의 약수의 개수 계산
    		int divisor=1;
    		
    		for(int i=1;i<=n/2;i++)
    			if(n%i==0)
    				divisor++;
    		
    		// n의 약수의 개수 출력
    		bw.write(n+" "+divisor+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class