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
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int X = Integer.valueOf(st.nextToken());
    		
    		// '+'인 경우
    		if(st.nextToken().equals("+"))
    			X += Integer.valueOf(st.nextToken());
    		
    		// '-'인 경우
    		else
    			X -= Integer.valueOf(st.nextToken());
    		
    		// X O Y == Z인지 확인
    		st.nextToken();
    		
    		if(X==Integer.valueOf(st.nextToken()))
    			bw.write("Case "+i+": YES\n");
    		else
    			bw.write("Case "+i+": NO\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class