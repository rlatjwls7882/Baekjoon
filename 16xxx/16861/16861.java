import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 양의 정수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        // n 이상의 하샤드 수 출력
        for(;;n++) {
        	
        	// n의 각 자리수의 합 계산
        	int tmp=n, sum=0;
        	
        	while(tmp!=0) {
        		sum += tmp%10;
        		tmp /= 10;
        	}
        	
        	// n이 하샤드 수인지 판단
        	if(n%sum==0)
        		break;
        }
        
        // 하샤드 수 출력
        bw.write(n+"");
        bw.close();
    } // end of main
} // end of Main class