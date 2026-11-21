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
        
        // 일 수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 최장 스트릭 계산
        StringTokenizer st = new StringTokenizer(br.readLine());
        int longest_streak=0, current_streak=0;
        
        while(N--!=0) {
        	
        	if(Integer.valueOf(st.nextToken())>0)
        		current_streak++;
        	else
        		current_streak=0;
        	
        	if(current_streak>longest_streak)
        		longest_streak = current_streak;
        }
        
        // 최장 스트릭 출력
        bw.write(longest_streak+"");
        bw.close();
    } // end of main
} // end of Main class