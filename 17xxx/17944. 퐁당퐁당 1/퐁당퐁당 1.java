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
        
        // 총 팔의 개수 N, 계산해야 하는 차례 T
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken())*2;
        int T = Integer.valueOf(st.nextToken());
        
        // 해당 차례에 들어야하는 팔의 개수 계산
        if(T>=2*(N-1)) T %= 2*(N-1);
        if(T==0) T=2*(N-1);
        
        if(T<=N-1)
        	bw.write(T+"");
        else
        	bw.write(2*N-T+"");
        
        bw.close();
    } // end of main
} // end of Main class