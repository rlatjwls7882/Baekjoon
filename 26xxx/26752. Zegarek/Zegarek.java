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
        
        // 현재 시간 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        LocalTime time = LocalTime.of(
        	  Integer.valueOf(st.nextToken())
            , Integer.valueOf(st.nextToken())
            , Integer.valueOf(st.nextToken()))
        
        // 현재 시간에서 1초 후의 시간 출력
        .plusSeconds(1);
        
        bw.write(String.format("%02d:%02d:%02d"
                               , time.getHour(), time.getMinute(), time.getSecond()));
        
        bw.close();
    } // end of main
} // end of Main class