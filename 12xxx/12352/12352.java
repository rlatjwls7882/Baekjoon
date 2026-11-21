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
        
        // 테스트 케이스의 수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        for(int caseNum=1;caseNum<=T;caseNum++) {
        	
        	// N개의 덤불 입력
        	int N = Integer.valueOf(br.readLine());
        	
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	double[] bush = new double[N];
        	
        	for(int i=0;i<N;i++)
        		bush[i] = Double.valueOf(st.nextToken());
        	
        	// 덤불 다듬기
        	for(int i=1;i<N-1;i++)
        		if((bush[i-1]+bush[i+1])/2<=bush[i])
        			bush[i] = (bush[i-1]+bush[i+1])/2;
        	
        	// N-1번째 덤불의 높이 출력
        	bw.write(String.format("Case #%d: %f\n", caseNum, bush[N-2]));
        }
        
        bw.close();
    } // end of main
} // end of Main class