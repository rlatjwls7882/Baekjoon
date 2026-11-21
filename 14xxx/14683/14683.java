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
        
        // 출발좌표 (a, b)
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.valueOf(st.nextToken());
        int b = Integer.valueOf(st.nextToken());
        
        // 도착좌표 (c, d)
        st = new StringTokenizer(br.readLine());
        int c = Integer.valueOf(st.nextToken());
        int d = Integer.valueOf(st.nextToken());
        
        // 출발할 때 남아있는 배터리의 양
        int t = Integer.valueOf(br.readLine());
        
        // 도착할 때 배터리가 0이 남을 수 있는지 출력
        if(t-Math.abs(a-c)-Math.abs(b-d)>=0&&(t-Math.abs(a-c)-Math.abs(b-d))%2==0)
        	bw.write("Y");
        else
        	bw.write("N");
        
        bw.close();
    } // end of main
} // end of Main class