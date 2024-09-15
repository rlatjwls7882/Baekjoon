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
        
        // r, f 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.valueOf(st.nextToken());
        int f = Integer.valueOf(st.nextToken());
        
        // 몇 번 회전했는지 계산
        int rotate = f/r + (f%r>r/2.?1:0);
        
        // 회전 후 어떤 면이 위에 있는지 출력
        bw.write(rotate%2==0?"up":"down");
        
        bw.close();
    } // end of main
} // end of Main class