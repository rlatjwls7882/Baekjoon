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
    	
    	// 점수 9개 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	// 9문제의 최대점수
    	int[] maxScore = {100, 100, 200, 200, 300, 300, 400, 400, 500};
    	
    	// 커피 추첨 대상자 판단
    	int scoreSum=0;
    	
    	for(int i=0;i<9;i++) {
    		
    		int score = Integer.valueOf(st.nextToken());
    		
    		if(score>maxScore[i]) {
    			scoreSum=-1;
    			break;
    		}
    		
    		scoreSum+=score;
    	}
    	
    	// 커피 추첨 대상자 여부 출력
    	if(scoreSum==-1)
    		bw.write("hacker");
    	else if(scoreSum>=100)
    		bw.write("draw");
    	else
    		bw.write("none");
    	
    	bw.close();
    } // end of main
} // end of Main class