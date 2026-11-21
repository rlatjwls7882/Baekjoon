import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalDateTime;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 오늘과 내일 먹이를 주는 시간 입력
        StringTokenizer today = new StringTokenizer(br.readLine(),":");
        StringTokenizer tomorrow = new StringTokenizer(br.readLine(),":");
        
        // 먹이를 주는 사이에 걸린 시간 계산
        LocalDateTime time = LocalDateTime.of(0, 1, 2
        				, Integer.valueOf(tomorrow.nextToken())
                        , Integer.valueOf(tomorrow.nextToken()))
        		.minusHours(Integer.valueOf(today.nextToken()))
        		.minusMinutes(Integer.valueOf(today.nextToken()));
        
        // 먹이를 주는 사이에 걸린 시간 출력
        bw.write(String.format("%02d:%02d"
                            , (time.getDayOfMonth()-1)*24+time.getHour(), time.getMinute()));
        
        bw.close();
    } // end of main
} // end of Main class