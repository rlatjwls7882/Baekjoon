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
        
        // 동전의 가치의 수 N, 만들 가치의 합 K 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int K = Integer.valueOf(st.nextToken());
        
        // N개의 동전 입력
        int[] values = new int[N];
        
        for(int i=0;i<N;i++)
        	values[i] = Integer.valueOf(br.readLine());
        
        // K원을 만드는데 필요한 동전의 최소 개수 계산
        int coins=0;
        
        for(int i=N-1;i>=0;i--) {
        	
        	while(K>=values[i]) {
        		K-=values[i];
        		coins++;
        	}
        }
        
        // 동전 개수 출력
        bw.write(coins+"");
        bw.close();
    } // end of main
} // end of Main class