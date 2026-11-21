import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalTime;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 테스트 케이스의 수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        while(n-->0) {
        	
        	// 시험 시간 입력
        	StringTokenizer st = new StringTokenizer(br.readLine()," :");
        	
        	LocalTime time = LocalTime.of(0, 0, 0)
        			.minusHours(Integer.valueOf(st.nextToken()))
        			.minusMinutes(Integer.valueOf(st.nextToken()))
        			.minusSeconds(Integer.valueOf(st.nextToken()))
        			
        			.plusHours(Integer.valueOf(st.nextToken()))
        			.plusMinutes(Integer.valueOf(st.nextToken()))
        			.plusSeconds(Integer.valueOf(st.nextToken()));
        	
        	// 문제를 푸는 시간(초단위) 계산
        	int spend = Integer.valueOf(st.nextToken())*60;
        	
        	// 시험 진행 시간(초단위) 계산
        	int end = time.getHour()*3600+time.getMinute()*60+time.getSecond();
        	if(end==0) end = 24*60*60;
        	
        	// 시험에 통과하는지 확인
        	if(spend<=end)
        		bw.write("Perfect\n");
        	else if(spend<=end+3600)
        		bw.write("Test\n");
        	else
        		bw.write("Fail\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class