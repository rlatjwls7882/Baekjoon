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
    	
    	// 학생수 N
    	int N = Integer.valueOf(br.readLine());
    	
    	// N명의 최대-최소 점수의 차이 계산
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int maxScore=0, minScore=1000;
    	
    	while(N-->0) {
    		int score = Integer.valueOf(st.nextToken());
    		if(maxScore<score) maxScore=score;
    		if(minScore>score) minScore=score;
    	}
    	
    	bw.write(maxScore-minScore+"");
    	
    	bw.close();
    } // end of main
} // end of Main class