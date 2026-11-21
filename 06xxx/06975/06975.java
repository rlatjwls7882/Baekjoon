import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 반복횟수 입력
        int n = Integer.valueOf(br.readLine());
        
        while(n--!=0) {
        	
        	// 정수 N 입력
        	int N = Integer.valueOf(br.readLine());
        	
        	// 진약수의 합 계산
        	int sum = -N;
        	
        	for(int i=1;i<=N;i++) {
        		
        		// 약수를 두개씩 더함
        		if(N%i==0) {
        			
        			// 앞의 약수가 더 큰 경우
        			if(i>N/i)
        				break;
        			
        			// 두 약수가 일치할 경우
        			else if(i==N/i) {
        				sum+=i;
        				break;
        			}
        			
        			// 앞의 약수가 더 작은 경우
        			else
        				sum += i + N/i;
        		}
        	}
        	
        	// 완전수인 경우
        	if(sum==N)
        		bw.write(N+" is a perfect number.\n\n");
        	
        	// 부족수인 경우
        	else if(sum<N)
        		bw.write(N+" is a deficient number.\n\n");
        	
        	// 과잉수인 경우
        	else
        		bw.write(N+" is an abundant number.\n\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class