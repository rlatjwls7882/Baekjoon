import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 테스트 케이스 수
    	int T = Integer.valueOf(bf.readLine());
    	
    	while(T--!=0) {
    		// 우주선 개수 N, 목적지까지 거리 D, 갈 수 있는 우주선 수 cnt
    		StringTokenizer st = new StringTokenizer(bf.readLine());
    		int N = Integer.valueOf(st.nextToken());
    		int D = Integer.valueOf(st.nextToken());
    		int cnt=0;
    		
    		while(N--!=0) {
    			// 최고속도 v, 연료양 f, 연료소비율 c
    			st = new StringTokenizer(bf.readLine());
    			int v = Integer.valueOf(st.nextToken());
    			int f = Integer.valueOf(st.nextToken());
    			int c = Integer.valueOf(st.nextToken());
    			
    			// cnt 계산
    			if(D/(double)v<=f/(double)c)
    				cnt++;
    		}
    		
    		// cnt 출력
    		bw.write(cnt+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class