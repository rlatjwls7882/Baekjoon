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
        
        // 달의 수 m, 날의 수 d, 요일의 수 w 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int d = Integer.valueOf(st.nextToken());
        int m = Integer.valueOf(st.nextToken());
        int w = Integer.valueOf(st.nextToken());
        
        // 검색할 년월일 k, j, i 입력
        st = new StringTokenizer(br.readLine());
        int i = Integer.valueOf(st.nextToken());
        int j = Integer.valueOf(st.nextToken());
        long k = Integer.valueOf(st.nextToken());
        
        // k년 j월 i일의 요일 출력
        String dayOfWeek = "abcdefghijklmnopqrstuvwxyz";
        long day = (((k-1)*m+j-1)*d+i-1)%w;
        
        bw.write(dayOfWeek.charAt((int)day));
        
        bw.close();
    } // end of main
} // end of Main class