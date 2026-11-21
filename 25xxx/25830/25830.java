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
        
        // Donald가 입력하는 분과 초 입력
        StringTokenizer st = new StringTokenizer(br.readLine(),":");
        int m = Integer.valueOf(st.nextToken());
        int s = Integer.valueOf(st.nextToken());
        
        // Donald가 시간과 분으로 잘못 입력했을때 기다려야 하는 추가시간 계산
        LocalDateTime time = LocalDateTime.of(0, 1, 1, 0, 0)
        		.plusHours(m).plusMinutes(s)
        		.minusMinutes(m).minusSeconds(s);
        
        // Donald가 시간과 분으로 잘못 입력했을때 기다려야 하는 추가시간 출력
        bw.write(String.format("%02d:%02d:%02d", (time.getDayOfMonth()-1)*24+time.getHour()
                               , time.getMinute(), time.getSecond()));
        
        bw.close();
    } // end of main
} // end of Main class