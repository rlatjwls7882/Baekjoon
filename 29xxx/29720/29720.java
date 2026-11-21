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
        
        // 정수 N, M , K 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int M = Integer.valueOf(st.nextToken());
        int K = Integer.valueOf(st.nextToken());
        
        // 상대방이 현재까지 푼 문제 수의 최솟값과 최댓값 계산
        int min = N-M*K;
        int max = min+M-1;
        
        if(min<0) min=0;
        if(max<0) max=0;
        
        // 상대방이 현재까지 푼 문제 수의 최솟값과 최댓값 출력
        bw.write(min+" "+max);
        bw.close();
    } // end of main
} // end of Main class