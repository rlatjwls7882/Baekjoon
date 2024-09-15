import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 테스트 케이스 T
    	int T = Integer.valueOf(br.readLine());
    	
    	while(T--!=0) {
    		
    		// 아래에서 출발하는 열차수 N, 왼쪽에서 출발하는 열차수 M
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int N = Integer.valueOf(st.nextToken());
    		int M = Integer.valueOf(st.nextToken());
    		
    		// 충돌이 되지 않고 도착하는 열차수 계산
    		TreeSet<Integer> trainsNum = new TreeSet<Integer>();
    		
    		// 아래에서 출발해서 도착하는 열차수
    		st = new StringTokenizer(br.readLine());
    		for(int i=0;i<N;i++)
    			trainsNum.add(Integer.valueOf(st.nextToken()));
    		
    		// 왼쪽에서 출발해서 도착하는 열차수
    		st = new StringTokenizer(br.readLine());
    		for(int i=0;i<M;i++)
    			trainsNum.add(Integer.valueOf(st.nextToken()));
    		
    		// 충돌하는 열차수 출력
    		bw.write(N+M-trainsNum.size()+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class