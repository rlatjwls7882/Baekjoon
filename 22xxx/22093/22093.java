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
        
        // 테스트 케이스의 수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        while(T-->0) {
        	
        	// 참가자 수, 문제를 풀 수 있는 사람 수, 혐오하는 사람 수 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int n = Integer.valueOf(st.nextToken());
        	int a = Integer.valueOf(st.nextToken());
        	int b = Integer.valueOf(st.nextToken());
        	
        	// 문제를 푸는 사람의 최솟값과 최댓값 계산
        	int min = Math.max(0, a-b);
        	int max = Math.min(a, n-b);
        	
        	// 문제를 푸는 사람의 최솟값과 최댓값 출력
        	bw.write(String.format("%d %d\n", min, max));
        }
        
        bw.close();
    } // end of main
} // end of Main class