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
        
        // A, B, N 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.valueOf(st.nextToken());
        int B = Integer.valueOf(st.nextToken());
        int N = Integer.valueOf(st.nextToken());
        
        // 만들 수 있는 건축물의 높이를 오름차순으로 출력
        for(int i=1;i<=N;i++)
        	bw.write(A*N+B*i+" ");
        
        bw.close();
    } // end of main
} // end of Main class