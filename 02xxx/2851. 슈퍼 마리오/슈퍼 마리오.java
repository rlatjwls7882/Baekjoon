import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 100에 가장 가까운 점수 계산
        int score=0, maxscore=0;
        
        for(int i=0;i<10;i++) {
        	score += Integer.valueOf(br.readLine());
        	
        	if(Math.abs(100-maxscore)>=Math.abs(100-score))
        		maxscore = score;
        	else
        		break;
        }
        
        // 100에 가장 가까운 점수 출력
        bw.write(maxscore+"");
        
        bw.close();
    } // end of main
} // end of Main class