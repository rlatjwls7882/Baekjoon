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
        
        // 교실의 수 입력
        int N = Integer.valueOf(br.readLine());
        
        // 교수님이 걸어야하는 거리 계산
        int beforex=0, beforey=0, distance=0;
        
        for(int i=0;i<N;i++) {
        	
        	StringTokenizer st = new StringTokenizer(br.readLine()); 
        	int x = Integer.valueOf(st.nextToken());
        	int y = Integer.valueOf(st.nextToken());
        	
        	// 첫번째 값은 비교안함
        	if(i==0) {
        		beforex = x;
        		beforey = y;
        		continue;
        	}
        	
        	distance += Math.abs(beforex-x)+Math.abs(beforey-y);
        	beforex = x;
        	beforey = y;
        }
        
        // 교수님이 걸어야하는 거리 출력
        bw.write(distance+"");
        bw.close();
    } // end of main
} // end of Main class