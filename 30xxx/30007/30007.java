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
        
        // 라면을 끓이는 횟수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        while(N-->0) {
        	
        	// 라면 계수 A, 기본 물의 양 B, 끓일 라면의 수 X 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int A = Integer.valueOf(st.nextToken());
        	int B = Integer.valueOf(st.nextToken());
        	int X = Integer.valueOf(st.nextToken());
        	
        	// 필요한 물의 양 출력
        	bw.write(A*(X-1)+B+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class