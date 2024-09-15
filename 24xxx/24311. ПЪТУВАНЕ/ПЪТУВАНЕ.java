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
        
        // 기술 세미나가 시작하는 시간
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        LocalTime time = LocalTime
        .of(Integer.valueOf(st1.nextToken()), Integer.valueOf(st1.nextToken()))
        
        // 참가자 등록에 걸리는 시간
        .minusMinutes(Integer.valueOf(br.readLine()));
        		
        // 이동에 걸리는 시간
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        time = time
        .minusHours(Integer.valueOf(st2.nextToken()))
        .minusMinutes(Integer.valueOf(st2.nextToken()))
        
        // 짐을 푸는데 걸리는 시간
        .minusMinutes((Integer.valueOf(br.readLine())+1)*Integer.valueOf(br.readLine()))
        
        // 10분 전까지 도착해야함
        .minusMinutes(10);
        
        // 출발해야 하는 최소 시간 출력
        bw.write(String.format("%02d %02d", time.getHour(), time.getMinute()));
        
        bw.close();
    } // end of main
} // end of Main class