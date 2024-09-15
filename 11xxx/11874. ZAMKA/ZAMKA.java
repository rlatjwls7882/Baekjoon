import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 정수 L, D, X 입력
        int L = Integer.valueOf(br.readLine());
        int D = Integer.valueOf(br.readLine());
        int X = Integer.valueOf(br.readLine());
        
        // 최소 정수 계산
        for(int i=L;i<=D;i++) {
        	
        	// 자리 수의 합 계산
        	int sum=0, tmp=i;
        	
        	while(tmp!=0) {
        		sum += tmp%10;
        		tmp/=10;
        	}
        	
        	// 자리 수의 합이 X인 최소 정수 출력
        	if(sum==X) {
        		bw.write(i+"\n");
        		break;
        	}
        }
        
        // 최대 정수 계산
        for(int i=D;i>=L;i--) {
        	
        	// 자리 수의 합 계산
        	int sum=0, tmp=i;
        	
        	while(tmp!=0) {
        		sum += tmp%10;
        		tmp/=10;
        	}
        	
        	// 자리 수의 합이 X인 최대 정수 출력
        	if(sum==X) {
        		bw.write(i+"");
        		break;
        	}
        }
        
        bw.close();
    } // end of main
} // end of Main class