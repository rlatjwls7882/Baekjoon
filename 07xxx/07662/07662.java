import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 테스트 케이스의 수 T
    	int T = Integer.valueOf(br.readLine());
    	
    	while(T-->0) {
    		
    		// 연산의 개수 k
    		int k = Integer.valueOf(br.readLine());
    		
    		// k개의 연산 수행
    		TreeMap<Integer, Integer> Q = new TreeMap<>();
            
    		while(k-->0) {
    			
    			// 연산의 종류 opt와 정수 n
    			StringTokenizer st = new StringTokenizer(br.readLine());
    			char opt = st.nextToken().charAt(0);
    			int n = Integer.valueOf(st.nextToken());
    			
    			// 삽입
    			if(opt=='I')
    				Q.put(n, Q.getOrDefault(n, 0)+1);
                
                // 삭제
    			else {
    				if(Q.isEmpty()) continue;
    				else if(n==1) n=Q.lastKey();
    				else n=Q.firstKey();
    				
    				if(Q.put(n, Q.get(n)-1)==1) Q.remove(n);
    			}
    		}
    		
    		// Q에 남아있는 최댓값과 최솟값 출력
    		if(Q.isEmpty()) bw.write("EMPTY\n");
    		else bw.write(Q.lastKey()+" "+Q.firstKey()+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class