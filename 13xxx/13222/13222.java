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
        
        // 성냥의 수 N, 박스 밑면의 가로와 세로 길이 W, H 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int W = Integer.valueOf(st.nextToken());
        int H = Integer.valueOf(st.nextToken());
        
        // 박스에 성냥이 들어가는지 확인
        double digonal = Math.sqrt(W*W+H*H);
        
        while(N-->0)
        	if(Integer.valueOf(br.readLine())<=digonal)
        		bw.write("YES\n");
        	else
        		bw.write("NO\n");
        
        bw.close();
    } // end of main
} // end of Main class