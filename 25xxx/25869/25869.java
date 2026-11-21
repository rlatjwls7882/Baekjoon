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
        
        // 벽의 너비, 벽의 높이, 필요한 테두리 간격 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.valueOf(st.nextToken());
        int h = Integer.valueOf(st.nextToken());
        int d = Integer.valueOf(st.nextToken());
        
        // 설치할 수 있는 가장 큰 창문의 크기 출력
        if(w>d*2&&h>d*2)
        	bw.write((w-d*2)*(h-d*2)+"");
        else
        	bw.write("0");
        
        bw.close();
    } // end of main
} // end of Main class