import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int dayStart = Integer.valueOf(st.nextToken())*360+Integer.valueOf(st.nextToken())*30+Integer.valueOf(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int dayEnd = Integer.valueOf(st.nextToken())*360+Integer.valueOf(st.nextToken())*30+Integer.valueOf(st.nextToken());
		
		// 연차와 월차의 총 개수 계산
		int day = dayEnd-dayStart;
		int mon = day/30;
		int year = day/360;
		
		int yearHoliday=year*15, plus=0;
		for(int i=3;i<=year;i++) {
			if(i%2==1) {
				plus++;
			}
			yearHoliday += plus;
		}
		
		// 출력
		bw.write(String.format("%d %d\n", yearHoliday, Math.min(mon, 36)));
		bw.write(String.format("%ddays", day));
		
		bw.close();
	} // end of main()
} // end of Main class