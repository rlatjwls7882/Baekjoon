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

        // 테스트 케이스의 수 입력
        int T = Integer.valueOf(br.readLine());
        
        while(T--!=0) {
        	
        	// 처음 공의 높이, 공이 도달해야하는 높이 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	long x = Long.valueOf(st.nextToken());
        	long w = Long.valueOf(st.nextToken());
        	
        	// 공이 w에 도달할때까지 튕겨져야 하는 횟수 출력
        	int bound=0;
        	
        	for(;x<w;x*=2)
        		bound++;
        	
        	bw.write(bound+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class