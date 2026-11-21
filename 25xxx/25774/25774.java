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
        
        // 첫번째 날짜와 요일 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int d = Integer.valueOf(st.nextToken());
        int m = Integer.valueOf(st.nextToken());
        int y = Integer.valueOf(st.nextToken());
        int n = Integer.valueOf(st.nextToken());
        
        // 두번째 날짜가 몇번째 날인지 계산
        st = new StringTokenizer(br.readLine());
        int day = Integer.valueOf(st.nextToken())-d
        		+(Integer.valueOf(st.nextToken())-m)*30
        		+(Integer.valueOf(st.nextToken())-y)*360
        		+n-1;
        
        // 두번째 날짜의 요일 출력
        bw.write(day%7+1+"");
        
        bw.close();
    } // end of main
} // end of Main class