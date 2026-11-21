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
        
        // 남은 거리 n, 남은 시간 T
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int T = Integer.valueOf(st.nextToken());
        
        // 공원 입구까지의 거리 m
        int m = Integer.valueOf(br.readLine());
        
        // 공원 입구 전과 후의 속도 x, y
        st = new StringTokenizer(br.readLine());
        double x = Double.valueOf(st.nextToken());
        double y = Double.valueOf(st.nextToken());
        
        // 만나는 장소까지 걸리는 시간 계산
        int time = (int)Math.ceil((m/x+(n-m)/y)/60);
        
        // 모임에 늦는 시간 출력
        bw.write(Math.max(0, time-T)+"");
        
        bw.close();
    } // end of main
} // end of Main class