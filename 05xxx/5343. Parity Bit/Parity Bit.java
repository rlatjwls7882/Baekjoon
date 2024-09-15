import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 전송된 데이터의 라인 수 입력
        int N = Integer.valueOf(br.readLine());
        
        while(N-->0) {
        	
        	// 8의 배수 길이의 데이터 입력
        	String data = br.readLine();
        	
        	// 패리티 에러가 발생한 횟수 계산
        	int parityError=0;
        	
        	for(int i=0;i<data.length();i+=8) {
        		
        		// 8자리씩 1의 개수 계산
        		int numOfOne=0;
        		
        		for(int j=i;j<i+8;j++)
        			if(data.charAt(j)=='1')
        				numOfOne++;
        		
        		// 1의 개수가 홀수개면 패리티 에러 발생
        		if(numOfOne%2==1)
        			parityError++;
        	}
        	
        	// 패리티 에러가 발생한 횟수 출력
        	bw.write(parityError+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class