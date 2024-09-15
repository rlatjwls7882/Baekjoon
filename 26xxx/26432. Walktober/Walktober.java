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
        
        for(int numCases=1;numCases<=T;numCases++) {
        	
        	// 총 참가자 수, 경기가 진행되는 일 수, John의 ID
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int M = Integer.valueOf(st.nextToken());
        	int N = Integer.valueOf(st.nextToken());
        	int P = Integer.valueOf(st.nextToken());
        	
        	// 참가자의 걸음 수 입력
        	int[][] walk = new int[M][N];
        	
        	for(int i=0;i<M;i++) {
        		st = new StringTokenizer(br.readLine());
        		
        		for(int j=0;j<N;j++)
        			walk[i][j] = Integer.valueOf(st.nextToken());
        	}
        	
        	// 참가자의 최대 걸음 수 계산
        	int[] maxwalk = new int[N];
        	
        	for(int i=0;i<N;i++) {
        		int max=0;
        		
        		for(int j=0;j<M;j++)
        			if(max<walk[j][i])
        				max = walk[j][i];
        		
        		maxwalk[i] = max;
        	}
        	
        	// John이 걸어야 하는 추가 걸음 수 계산
        	int requireWalk=0;
        	
        	for(int i=0;i<N;i++)
        		requireWalk += Math.max(0, maxwalk[i]-walk[P-1][i]);
        	
        	// John이 걸어야 하는 추가 걸음 수 출력
        	bw.write(String.format("Case #%d: %d\n", numCases, requireWalk));
        }
        
        bw.close();
    } // end of main
} // end of Main class