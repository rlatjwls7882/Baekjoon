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
        long n = Long.valueOf(br.readLine());
        
        // 변환 횟수 계산
        int cnt=0;
        
        while(true) {
        	
        	// 짝수인 경우 2로 나눔
        	if(n%2==0)
        		n/=2;
        	
        	// 1인 경우 종료
        	else if(n==1)
        		break;
        	
        	// 홀수인 경우 1을 더함
        	else
        		n++;
        	
        	cnt++;
        }
        
        // 변환 횟수 출력
        bw.write(cnt+"");
        bw.close();
    } // end of main
} // end of Main class