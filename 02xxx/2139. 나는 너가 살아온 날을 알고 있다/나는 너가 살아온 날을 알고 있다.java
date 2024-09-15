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
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int D = Integer.valueOf(st.nextToken());
			int M = Integer.valueOf(st.nextToken());
			int Y = Integer.valueOf(st.nextToken());
			
			if(D==0&&M==0&&Y==0) {
				break;
			}
			
			// 1월 1일부터 입력된 날까지의 일 수 계산
			int day=0;
			for(int i=1;i<=M;i++) {
				if(i==M) {
					day += D;
				} else if(i==2&&(Y%4==0&&Y%100!=0||Y%400==0)) {
					day += 29;
				} else if(i==2) {
					day += 28;
				} else if(i==4||i==6||i==9||i==11) {
					day += 30;
				} else {
					day += 31;
				}
			}
			
			bw.write(Integer.toString(day));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class