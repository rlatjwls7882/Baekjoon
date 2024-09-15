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
        	
        	// 집에 있는 사람 수의 최솟값, 현재 집에 있는 사람 수
        	int min=0, cur=0;
        	
        	// 집에 사람들이 들어오고 나가는 횟수 입력
        	int M = Integer.valueOf(br.readLine());
        	
        	// 집에 사람들이 들어왔다 나가는 행위 수행
        	while(M--!=0) {
        		StringTokenizer st = new StringTokenizer(br.readLine());
        		cur += Integer.valueOf(st.nextToken())
        				-Integer.valueOf(st.nextToken());
        		
        		if(cur<min) min=cur;
        	}
        	
        	// 시작할 때 집에 있던 사람 수의 최솟값 출력
        	bw.write(-min+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class