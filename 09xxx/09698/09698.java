import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalTime;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 테스트 케이스의 수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        for(int i=1;i<=T;i++) {
        	
        	// 현재 시간 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	LocalTime time = LocalTime.of
        			(Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken()));
        	
        	// 45분 전의 시간 출력
        	time = time.minusMinutes(45);
        	
        	bw.write(String.format("Case #%d: %d %d\n", i, time.getHour(), time.getMinute()));
        }
        
        bw.close();
    } // end of main
} // end of Main class