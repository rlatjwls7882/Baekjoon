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
        
        // 허리와 목의 높이 Y N, 가격한 횟수 P 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Y = Integer.valueOf(st.nextToken());
        int N = Integer.valueOf(st.nextToken());
        int P = Integer.valueOf(st.nextToken());
        
        // 공정한 공격 횟수 계산
        st = new StringTokenizer(br.readLine());
        int cnt=0;
        
        for(int i=0;i<P;i++) {
        	int H = Integer.valueOf(st.nextToken());
        	
        	if(Y<=H&&H<=N)
        		cnt++;
        }
        
        // 공정한 공격 횟수 출력
        bw.write(cnt+"");
        bw.close();
    } // end of main
} // end of Main class