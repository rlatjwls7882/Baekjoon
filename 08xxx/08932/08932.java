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
    	
    	while(T--!=0) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int score=0;
    		
    		// 100미터 허들
    		double P = Double.valueOf(st.nextToken());
    		score += 9.23076*Math.pow(26.7-P, 1.835);
    		
    		// 높이뛰기
    		P = Double.valueOf(st.nextToken());
    		score += 1.84523*Math.pow(P-75, 1.348);
    		
    		// 포환던지기
    		P = Double.valueOf(st.nextToken());
    		score += 56.0211*Math.pow(P-1.5, 1.05);
    		
    		// 200미터 달리기
    		P = Double.valueOf(st.nextToken());
    		score += 4.99087*Math.pow(42.5-P, 1.81);
    		
    		// 멀리뛰기
    		P = Double.valueOf(st.nextToken());
    		score += 0.188807*Math.pow(P-210, 1.41);
    		
    		// 창던지기
    		P = Double.valueOf(st.nextToken());
    		score += 15.9803*Math.pow(P-3.8, 1.04);
    		
    		// 800미터 달리기
    		P = Double.valueOf(st.nextToken());
    		score += 0.11193*Math.pow(254-P, 1.88);
    		
    		// 민혁이의 총점 출력
    		bw.write(score+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class