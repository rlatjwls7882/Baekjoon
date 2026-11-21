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
        
        // 테스트 케이스의 수 T
        int T = Integer.valueOf(br.readLine());
        
        for(int numCases=1;numCases<=T;numCases++) {
        	
        	// 세 정수 R, A, B
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	long R = Long.valueOf(st.nextToken());
        	long A = Long.valueOf(st.nextToken());
        	long B = Long.valueOf(st.nextToken());
        	
        	// 원의 반지름 제곱의 합 계산
        	double sum=0;
        	
        	for(int i=0;R!=0;i++) {
        		if(i==0);
        		else if(i%2==1)
        			R*=A;
        		else
        			R/=B;
        		
        		sum += R*R;
        	}
        	
        	// 원의 넓이의 합 출력
        	bw.write(String.format("Case #%d: %f\n", numCases, sum*Math.PI));
        }
        
        bw.close();
    } // end of main
} // end of Main class