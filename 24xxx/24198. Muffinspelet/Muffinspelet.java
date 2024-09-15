import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 총 머핀 수 N 입력
    	int N = Integer.valueOf(br.readLine());
    	
    	// 승욱이가 먹는 머핀수 S, 예찬이가 먹는 머핀수 Y
    	int S=0, Y=0;
    	
    	// 남아있는 머핀수가 0일때까지 반복
    	while(N!=0) {
    		
    		// 승욱이 머핀을 둘로 나누고 예찬이 큰걸 가져가기
    		Y += N - N/2;
    		N/=2;
    		
    		// 예찬이 머핀을 둘로 나누고 승욱이 큰걸 가져가기
    		S += N - N/2;
    		N/=2;
    	}
    	
    	// 승욱과 예찬이 먹은 머핀 양 출력
    	bw.write(S+" "+Y);
    	bw.close();
    } // end of main
} // end of Main class