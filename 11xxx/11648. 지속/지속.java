import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 숫자 입력
    	int N = Integer.valueOf(br.readLine());
    	
    	// 기쁨이 지속되는 단계 수 계산 
    	int step=0;
    	
    	while(N/10!=0) {

    		// tmp에 다음 숫자 계산
    		int tmp=1;
    		
    		while(N!=0) {
    			tmp*=N%10;
    			N/=10;
    		}
    		
    		// N에 tmp의 값 대입
    		N = tmp;
    		step++;
    	}
    	
    	// 기쁨이 지속되는 단계 수 출력
    	bw.write(step+"");
    	bw.close();
    } // end of main
} // end of Main class