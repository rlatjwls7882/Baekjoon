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
        
        // 꿀을 먹어야 하는 횟수 n, 토끼-부엉이 거리 a, 토끼-이요르 거리 b, 부엉이-이요르 거리 c
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int a = Integer.valueOf(st.nextToken());
        int b = Integer.valueOf(st.nextToken());
        int c = Integer.valueOf(st.nextToken());
        
        // 총 걸어야 하는 거리 계산
        int distance=0;
        if(n>1) distance = Math.min(a, b) + Math.min(a, Math.min(b, c))*(n-2);
        
        bw.write(String.format("%d %d", distance/100, distance%100));
        
        bw.close();
    } // end of main
} // end of Main class