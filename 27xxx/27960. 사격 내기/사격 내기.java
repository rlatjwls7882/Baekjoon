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
    	
    	// A와 B의 점수 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int scoreA = Integer.valueOf(st.nextToken());
    	int scoreB = Integer.valueOf(st.nextToken());
    	
    	// C의 점수 계산
    	int scoreC=scoreA^scoreB;
    	
    	// C의 점수 출력
    	bw.write(scoreC+"");
    	bw.close();
    } // end of main
} // end of Main class
