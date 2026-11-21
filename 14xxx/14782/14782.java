import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 정수 I 입력
        int I = Integer.valueOf(br.readLine());
        
        // 정수 I의 모든 약수의 합 계산
        int sum=0;
        
        for(int i=1;;i++) {
        	
        	if(I%i==0) {
        		
        		// 약수를 2개씩 더함
        		if(i<I/i)
        			sum+=i+I/i;
        		
        		else if(i==I/i)
        			sum+=i;
        		
        		else
        			break;
        	}
        }
        
        // I의 모든 약수의 합 출력
        bw.write(sum+"");
        bw.close();
    } // end of main
} // end of Main class