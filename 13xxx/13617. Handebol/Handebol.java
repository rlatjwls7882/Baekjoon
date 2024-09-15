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
        
        // 선수의 수와 경기의 수 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int M = Integer.valueOf(st.nextToken());
        
        // 매 경기 득점한 선수의 수 계산
        int player=0;
        
        while(N-->0) {
        	
        	st = new StringTokenizer(br.readLine());
        	int score=1;
        	
        	for(int i=0;i<M;i++)
        		if(st.nextToken().equals("0")) {
        			score=0;
        			break;
        		}
        	
        	player += score;
        }
        
        // 매 경기 득점한 선수의 수 출력
        bw.write(player+"");
        bw.close();
    } // end of main
} // end of Main class