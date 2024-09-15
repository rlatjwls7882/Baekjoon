import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalDateTime;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true) {
        	
        	// 이벤트의 시작시간과 이벤트의 길이 입력
        	String string = br.readLine();
        	StringTokenizer st = new StringTokenizer(string,": ");
        	
        	// 00:00 00:00 입력시 종료
        	if(string.equals("00:00 00:00"))
        		break;
        	
        	// 이벤트의 종료시간 계산
        	LocalDateTime dt = LocalDateTime.of(0, 1, 1
        			, Integer.valueOf(st.nextToken())
        			, Integer.valueOf(st.nextToken()), 0);
        	
        	dt = dt.plusHours(Integer.valueOf(st.nextToken()))
        	.plusMinutes(Integer.valueOf(st.nextToken()));
        	
        	// 이벤트의 종료시간 출력
        	if(dt.getDayOfMonth()==1)
        		bw.write(String.format("%02d:%02d"
        						, dt.getHour()
        						, dt.getMinute())+"\n");
        	else
        		bw.write(String.format("%02d:%02d +%d"
        						, dt.getHour()
        						, dt.getMinute()
        						, dt.getDayOfMonth()-1)+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class