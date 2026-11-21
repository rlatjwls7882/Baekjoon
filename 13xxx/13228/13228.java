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
        	
        	// 지금 있는 (x, y, 층)과 도착예정인 (x, y, 층) 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int x1 = Integer.valueOf(st.nextToken());
        	int y1 = Integer.valueOf(st.nextToken());
        	int floor1 = Integer.valueOf(st.nextToken());
        	int x2 = Integer.valueOf(st.nextToken());
        	int y2 = Integer.valueOf(st.nextToken());
        	int floor2 = Integer.valueOf(st.nextToken());
        	
        	// 두 점 간 거리 출력
        	bw.write(Math.abs(x2-x1)
        			+Math.abs(y2-y1)
        			+floor1+floor2+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class