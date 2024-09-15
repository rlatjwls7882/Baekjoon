import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st = new StringTokenizer(bf.readLine());
    	
    	// 학생 수
    	int N = Integer.valueOf(st.nextToken());
    	
    	// 멀티탭의 수
    	int K = Integer.valueOf(st.nextToken());
    	st = new StringTokenizer(bf.readLine());
    	
    	// 사용할 수 있는 코드의 수
    	int code=0;
    	
    	while(K--!=0) {
    		int A = Integer.valueOf(st.nextToken());
    		
    		// 코드의 수가 짝수일 때와 홀수일 때의 차이
    		code+=A/2;
    		if(A%2!=0) code++;
    	}
    	
    	// 모든 학생이 사용할 수 있는지 출력
    	if(code>=N)
    		bw.write("YES");
    	else
    		bw.write("NO");
    	
    	bw.close();
    } // end of main
} // end of Main class