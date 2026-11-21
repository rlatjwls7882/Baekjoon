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
        
        // 생활관의 수 N, 분배의 기준 X
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int X = Integer.valueOf(st.nextToken());
        
        // 병사의 수 계산
        int soldier=0;
        st = new StringTokenizer(br.readLine());
        
        while(N-->0)
        	soldier += Integer.valueOf(st.nextToken());
        
        // 모든 병사가 행복하게 병영외 급식을 즐길 수 있는지 확인
        bw.write(soldier%X==0?"1":"0");
        
        bw.close();
    } // end of main
} // end of Main class