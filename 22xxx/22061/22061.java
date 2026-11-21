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
        	
        	// 1루블 동전과 2루블 동전의 수, 자전거의 가격 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int a = Integer.valueOf(st.nextToken());
        	int b = Integer.valueOf(st.nextToken());
        	int c = Integer.valueOf(st.nextToken());
        	
        	// 거스름돈 없이 자전거를 살 수 있는지 계산
        	
        	// 2루블 동전
        	if(c/2<=b)
        		c -= c/2*2;
        	else
        		c -= b*2;
        	
        	// 1루블 동전
        	if(c<=a)
        		bw.write("YES\n");
        	else
        		bw.write("NO\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class