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
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int A = Integer.valueOf(st.nextToken());
        
        // 발행해야하는 총 티켓 수 계산
        st = new StringTokenizer(br.readLine());
        int cnt=0;
        
        while(n-->0)
        	cnt += Integer.valueOf(st.nextToken())/A;
        
        bw.write(cnt+"");
        
        bw.close();
    } // end of main
} // end of Main class