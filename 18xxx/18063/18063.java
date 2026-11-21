import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 곡의 수, 다음 노래를 재생하는데 걸리는 시간 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int c = Integer.valueOf(st.nextToken());
        
        // 모든 노래를 재생하는데 걸리는 시간 계산
        LocalTime time = LocalTime.of(0, 0, 0);
        time = time.minusSeconds(c*(n-1));
        
        while(n--!=0) {
        	st = new StringTokenizer(br.readLine(),":");
        	time = time.plusMinutes(Integer.valueOf(st.nextToken()))
        			.plusSeconds(Integer.valueOf(st.nextToken()));
        }
        
        // 모든 노래를 재생하는데 걸리는 시간 출력
        bw.write(time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        bw.close();
    } // end of main
} // end of Main class