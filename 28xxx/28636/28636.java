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
        
        // 들은 노래의 수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        // 노래의 총 길이 계산
        LocalTime time = LocalTime.of(0, 0, 0);
        
        while(n-->0) {
        	StringTokenizer st = new StringTokenizer(br.readLine(),":");
        	
        	time = time.plusMinutes(Integer.valueOf(st.nextToken()))
        			.plusSeconds(Integer.valueOf(st.nextToken()));
        }
        
        // 노래의 총 길이 출력
        bw.write(String.format("%02d:%02d:%02d"
                               , time.getHour(), time.getMinute(), time.getSecond()));
        
        bw.close();
    } // end of main
} // end of Main class