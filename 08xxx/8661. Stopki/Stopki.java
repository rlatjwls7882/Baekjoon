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
        
        // 서로 떨어져 선 거리, 코직의 발의 길이, 아드리안의 발의 길이 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.valueOf(st.nextToken());
        int k = Integer.valueOf(st.nextToken());
        int a = Integer.valueOf(st.nextToken());
        
        // 코직과 아드리안 중 누가 이기는지 출력
        x %= k+a;
        
        if(x<k)
        	bw.write("1");
        else
        	bw.write("0");
        
        bw.close();
    } // end of main
} // end of Main class