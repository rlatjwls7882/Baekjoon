import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 잠에 드는 시간과 잠에서 깨어나는 시간 입력
        int sleep = Integer.valueOf(br.readLine());
        int wakeup = Integer.valueOf(br.readLine());
        
        // 잠을 잔 시간 계산
        int sleepingTime = wakeup - sleep;
        
        if(sleepingTime<0) sleepingTime+=24;
        
        // 잠을 잔 시간 출력
        bw.write(sleepingTime+"");
        bw.close();
    } // end of main
} // end of Main class