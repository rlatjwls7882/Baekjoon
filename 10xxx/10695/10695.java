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
        	
        	// 체스판의 길이 n, 시작지점(r1, c1), 도착지점(r2, c2) 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int n = Integer.valueOf(st.nextToken());
        	int r1 = Integer.valueOf(st.nextToken());
        	int c1 = Integer.valueOf(st.nextToken());
        	int r2 = Integer.valueOf(st.nextToken());
        	int c2 = Integer.valueOf(st.nextToken());
        	
        	// 말이 시작시점에서 단 한번의 움직임으로 도착지점에 도달할 수 있는지 출력
        	if(Math.abs((r1-r2)*(c1-c2))==2)
        		bw.write(String.format("Case %d: YES\n", i));
        	else
        		bw.write(String.format("Case %d: NO\n", i));
        }
        
        bw.close();
    } // end of main
} // end of Main class