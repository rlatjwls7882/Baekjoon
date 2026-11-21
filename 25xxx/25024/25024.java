import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 테스트 케이스의 수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        while(T--!=0) {
        	
        	// x, y 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int x = Integer.valueOf(st.nextToken());
        	int y = Integer.valueOf(st.nextToken());
        	
        	// x시 y분으로 읽을 수 있는지 확인
        	try {
				LocalTime lt = LocalTime.of(x, y);
        		bw.write("Yes ");
        		
			} catch (Exception e) {
				bw.write("No ");
			}
        	
        	// x월 y일으로 읽을 수 있는지 확인
        	try {
        		LocalDate ld = LocalDate.of(0, x, y);
        		bw.write("Yes\n");
        		
        	} catch (Exception e) {
        		bw.write("No\n");
        	}
        }
        
        bw.close();
    } // end of main
} // end of Main class