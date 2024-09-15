import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	while(true) {
    		
    		// N 입력
    		int N = Integer.valueOf(bf.readLine());
    		
    		// 0일때 종료
    		if(N==0) break;
    		
    		// 정사각형 개수 계산
    		int cnt=0;
    		for(int i=1;i<=N;i++)
    			cnt+=i*i;
    		
    		// 정사각형 개수 출력
    		bw.write(cnt+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class