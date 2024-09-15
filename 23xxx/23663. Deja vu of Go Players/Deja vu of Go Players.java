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
        	
        	// 붉은 옷의 더미 n, 흰 옷의 더미 m 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int n = Integer.valueOf(st.nextToken());
        	int m = Integer.valueOf(st.nextToken());
        	
        	// 붉은 옷이 이길 수 있는지 확인
        	br.readLine(); br.readLine();
        	
        	if(n<=m)
        		bw.write("Yes\n");
        	else
        		bw.write("No\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class