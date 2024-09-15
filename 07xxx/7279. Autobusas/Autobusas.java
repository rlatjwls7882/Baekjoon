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
        
        // 버스 노선의 수 N, 버스 좌석의 수 K
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int K = Integer.valueOf(st.nextToken());
        
        // 버스의 최대 승객수 계산
        int max=0, cur=0;
        
        while(N-->0) {
        	st = new StringTokenizer(br.readLine());
        	cur += Integer.valueOf(st.nextToken()) - Integer.valueOf(st.nextToken());
        	
        	if(max<cur) max=cur;
        }
        
        // 버스에 서있는 최대 승객수 출력
        bw.write(Math.max(0, max-K)+"");
        
        bw.close();
    } // end of main
} // end of Main class