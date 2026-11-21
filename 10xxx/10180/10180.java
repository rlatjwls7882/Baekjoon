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
    	
    	// 테스트 케이스 T
    	int T = Integer.valueOf(br.readLine());
    	
    	while(T--!=0) {
    		
    		// 함선의 수 N, 거리 D
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int N = Integer.valueOf(st.nextToken());
    		int D = Integer.valueOf(st.nextToken());
    		
    		// 도달할 수 있는 함선 수 reachShipNum
    		int reachShipNum=0;
    		while(N--!=0) {
    			
    			// 최대 속도 v, 연료의 양 f, 연비 c
    			st = new StringTokenizer(br.readLine());
    			int v = Integer.valueOf(st.nextToken());
    			int f = Integer.valueOf(st.nextToken());
    			int c = Integer.valueOf(st.nextToken());
    			
    			// 도달할 수 있는 함선수 계산
    			if(v*f>=D*c)
    				reachShipNum++;
    		}
    		
    		// 함선 수 출력
    		bw.write(reachShipNum+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class