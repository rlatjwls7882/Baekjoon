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
        
        // 패티의 개수와 치즈의 개수 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.valueOf(st.nextToken());
        int B = Integer.valueOf(st.nextToken());
        
        // 패티의 개수 > 치즈의 개수
        if(A>B)
        	bw.write(B+(B+1)+"");
        
        // 패티의 개수 <= 치즈의 개수
        else
        	bw.write(A+(A-1)+"");
        
        bw.close();
    } // end of main
} // end of Main class