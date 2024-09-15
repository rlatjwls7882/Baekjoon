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
		
		// 현재 시간과 임무를 시작한 시간 입력
		StringTokenizer cur = new StringTokenizer(br.readLine(),":");
		StringTokenizer start = new StringTokenizer(br.readLine(),":");
		
		// 임무를 수행하는데 남은 시간 계산
		LocalTime remain = LocalTime.of(0, 0)
				.minusHours(Integer.valueOf(cur.nextToken()))
				.minusMinutes(Integer.valueOf(cur.nextToken()))
				.minusSeconds(Integer.valueOf(cur.nextToken()))
				.plusHours(Integer.valueOf(start.nextToken()))
				.plusMinutes(Integer.valueOf(start.nextToken()))
				.plusSeconds(Integer.valueOf(start.nextToken()));
		
		bw.write(String.format("%02d:%02d:%02d"
                               , remain.getHour(), remain.getMinute(), remain.getSecond()));
		
		bw.close();
	} // end of main()
} // end of Main class