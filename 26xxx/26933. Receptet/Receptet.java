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
    	
    	// 재료 수 N, 비용 cost
    	int N = Integer.valueOf(br.readLine());
    	int cost=0;
    	
    	while(N--!=0) {
    		// 가지고 있는 양 H, 필요한 양 B, 비용 K
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int H = Integer.valueOf(st.nextToken());
    		int B = Integer.valueOf(st.nextToken());
    		int K = Integer.valueOf(st.nextToken());
    		
    		// 비용 계산
    		if(B>H)
    			cost += (B-H)*K;
    	}
    	
    	// 비용 출력
    	bw.write(cost+"");
    	bw.close();
    } // end of main
} // end of Main class