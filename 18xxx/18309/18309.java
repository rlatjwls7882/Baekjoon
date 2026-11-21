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
        
        // 가장 낮은 온도와 가장 높은 온도 계산
        int lowest=50, highest=-50;
        
        while(true) {
        	try {
        		
        		// 날짜
        		StringTokenizer st = new StringTokenizer(br.readLine());
        		st.nextToken();
        		
        		// 온도
        		while(st.hasMoreTokens()) {
        			int temp = Integer.valueOf(st.nextToken());
        			
        			if(temp>highest) highest=temp;
        			if(temp<lowest) lowest=temp;
        		}
			} catch (Exception e) { break; }
        }
        
        // 가장 낮은 온도와 가장 높은 온도 출력
        bw.write(lowest+" "+highest);
        
        bw.close();
    } // end of main
} // end of Main class