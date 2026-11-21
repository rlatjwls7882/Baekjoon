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
		
		StringTokenizer st = new StringTokenizer(br.readLine(), "- ");
		int year = Integer.valueOf(st.nextToken());
		int mon = Integer.valueOf(st.nextToken());
		int day = Integer.valueOf(st.nextToken());
		int N = Integer.valueOf(st.nextToken())-1;
		
		// 날짜 계산
		while(N-->0) {
			day++;
			if(day==32&&(mon==1||mon==3||mon==5||mon==7||mon==8||mon==10||mon==12)
					||day==31&&(mon==4||mon==6||mon==9||mon==11)
					||day==30&&mon==2&&(year%4==0&&year%100!=0||year%400==0)
					||day==29&&mon==2&&!(year%4==0&&year%100!=0||year%400==0)) {
				day=1;
				mon++;
			}
			if(mon==13) {
				year++;
				mon=1;
			}
		}
		
		// 출력
		bw.write(String.format("%04d-%02d-%02d", year, mon, day));
		
		bw.close();
	} // end of main()
} // end of Main class