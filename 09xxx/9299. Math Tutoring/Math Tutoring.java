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
        
        for(int i=1;i<=T;i++) {
        	
        	// 가장 큰 지수 n 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int n = Integer.valueOf(st.nextToken());
        	
        	// 미분했을 때 만들어지는 가장 큰 지수 출력
        	bw.write(String.format("Case %d: %d", i,n-1)+"");
        	
        	// 도함수의 계수 출력
        	for(;n!=0;n--)
        		bw.write(" "+(n*Integer.valueOf(st.nextToken())));
        	
        	// 개행
        	bw.write("\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class