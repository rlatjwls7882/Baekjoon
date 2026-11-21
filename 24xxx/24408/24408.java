import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 입력하는 숫자의 길이 n 입력
        int n = Integer.valueOf(br.readLine());
        
        while(n-->0) {
        	
        	int firstNum = Integer.valueOf(br.readLine());
        	
        	// 첫번째 수의 배수가 나올때까지 반복
        	while(n-->0) {
        		
        		int nextNum = Integer.valueOf(br.readLine());
        		
        		// 첫번째 수의 배수 출력
        		if(nextNum%firstNum==0) {
        			bw.write(nextNum+"\n");
        			break;
        		}
        	}
        }
        
        bw.close();
    } // end of main
} // end of Main class