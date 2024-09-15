import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 정수 A, B 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.valueOf(st.nextToken());
        int B = Integer.valueOf(st.nextToken());
        
        // B -> A 변환
        boolean ifAisB = false;
        int arithmeticNum=1;
        
        while(true) {
        	
        	// A==B인 경우 종료
        	if(A==B) {
        		ifAisB = true;
        		break;
        	}
        	
        	// 일의 자리 숫자가 1인 경우 10으로 나눔
        	else if(B%10==1)
        		B/=10;
        	
        	// 일의 자리 숫자가 3, 5, 7, 9인 경우 종료
        	else if(B%2==1||B<A)
        		break;
        	
        	// 2의 배수인경우 2로 나눔
        	else if(B%2==0)
        		B/=2;
        	
        	arithmeticNum++;
        }
        
        // A==B인 경우 연산횟수 출력
        if(ifAisB)
        	bw.write(arithmeticNum+"");
        else
        	bw.write("-1");
        
        bw.close();
    } // end of main
} // end of Main class