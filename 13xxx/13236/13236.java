import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 정수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        while(true) {
        	
        	// n==1인 경우 종료
        	if(n==1)
        		break;
        	
        	// n==1 전까지의 수열 출력
        	bw.write(n+" ");
        	
        	// n이 짝수인 경우 n/2
        	if(n%2==0)
        		n/=2;
        	
        	// n이 홀수인 경우 n*3+1
        	else
        		n=n*3+1;
        }
        
        // n==1 출력
        bw.write(n+"");
        bw.close();
    } // end of main
} // end of Main class