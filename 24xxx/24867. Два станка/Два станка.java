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
        
        // 근무 시간 입력
        long k = Long.valueOf(br.readLine());
        
        // 첫번째 기계의 시동을 거는데 걸리는 시간 a, 분당 생산량 x 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.valueOf(st.nextToken());
        long x = Long.valueOf(st.nextToken());
        
        // 두번째 기계의 시동을 거는데 걸리는 시간 b, 분당 생산량 y 입력
        st = new StringTokenizer(br.readLine());
        long b = Long.valueOf(st.nextToken());
        long y = Long.valueOf(st.nextToken());
        
        // 부품을 더 많이 생성하는 케이스 출력
        long afirst = Math.max(0, (k-a)*x) + Math.max(0, (k-a-b)*y);
        long bfirst = Math.max(0, (k-b)*y) + Math.max(0, (k-b-a)*x);
        
        bw.write(Math.max(afirst, bfirst)+"");
        
        bw.close();
    } // end of main
} // end of Main class