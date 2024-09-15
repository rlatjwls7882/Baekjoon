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
        
        // 테스트 케이스의 수 입력
        int T = Integer.valueOf(br.readLine());
        
        for(int i=1;i<=T;i++) {
        	
        	// 분모 n, 분자 d 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int n = Integer.valueOf(st.nextToken());
        	int d = Integer.valueOf(st.nextToken());
        	
        	// 기분수의 정수부분 I, 분자부분 N 계산
        	int I = n/d;
        	int N = n%d;
        	
        	// 정수부분과 분자부분이 모두 0인 경우
        	if(I==0&&N==0)
        		bw.write(String.format("Case %d: 0\n", i));
        	
        	// 분자부분이 0인 경우
        	else if(N==0)
        		bw.write(String.format("Case %d: %d\n", i, I));
        	
        	// 정수부분이 0인 경우
        	else if(I==0)
        		bw.write(String.format("Case %d: %d/%d\n", i, N, d));
        	
        	// 0이 없는 경우
        	else
        		bw.write(String.format("Case %d: %d %d/%d\n", i, I, N, d));
        }
        
        bw.close();
    } // end of main
} // end of Main class