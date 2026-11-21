import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 테스트 케이스 수 입력
    	int T = Integer.valueOf(bf.readLine());
    	
    	while(T--!=0) {
    		// 학생수 입력
    		bf.readLine();
    		int N = Integer.valueOf(bf.readLine());
    		
    		// 사탕수 계산
    		long candyNum=0;
    		for(int i=0;i<N;i++)
    			candyNum+=Long.valueOf(bf.readLine())%N;
    		
    		// 공통분배 가능 여부 출력
    		if(candyNum%N==0)
    			bw.write("YES\n");
    		else
    			bw.write("NO\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class