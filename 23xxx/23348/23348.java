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
    	
    	// 각각의 기술에 대한 난이도 입력 
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int A = Integer.valueOf(st.nextToken());
    	int B = Integer.valueOf(st.nextToken());
    	int C = Integer.valueOf(st.nextToken());
    	
    	// 참가한 동아리 수
    	int N = Integer.valueOf(br.readLine());
    	
    	// 각 동아리별 점수 계산
    	int maxScore=0;
    	
    	while(N--!=0) {
    		
    		int score=0;
    		
    		for(int i=0;i<3;i++) {
    			st = new StringTokenizer(br.readLine());
    			
    			score += Integer.valueOf(st.nextToken())*A
    					+Integer.valueOf(st.nextToken())*B
    					+Integer.valueOf(st.nextToken())*C;
    		}
    		
    		if(maxScore<score) maxScore=score;
    	}
    	
    	// 가장 높은 점수 출력
    	bw.write(maxScore+"");
    	bw.close();
    } // end of main
} // end of Main class