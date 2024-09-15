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
        
        while(T--!=0) {
        	
        	// N, M 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int N = Integer.valueOf(st.nextToken());
        	int M = Integer.valueOf(st.nextToken());
        	
        	// N부터 M까지의 0의 개수 계산
        	int zeroNum=0;
        	
        	for(int i=N;i<=M;i++) {
        		
        		int tmp=i;
        		
        		do {
        			if(tmp%10==0)
        				zeroNum++;
        			
        			tmp/=10;
                    
        		} while(tmp!=0);
        	}
        	
        	// N부터 M까지의 0의 개수 출력
        	bw.write(zeroNum+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class