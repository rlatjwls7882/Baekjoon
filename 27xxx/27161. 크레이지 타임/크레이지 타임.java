import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static boolean hourglass=false;
	static int curHour=1;
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		// 플레이어가 외쳐야 하는 시각과 하는 행동 계산
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String S = st.nextToken();
			int X = Integer.valueOf(st.nextToken());
			
			if(S.equals("HOURGLASS")) {
				bw.write(String.format("%d NO\n", curHour));
				if(X!=curHour) {
					hourglass = !hourglass;
				}
				nextHour();
				continue;
			}
			
			if(X==curHour) {
				bw.write(String.format("%d YES\n", curHour));
			} else {
				bw.write(String.format("%d NO\n", curHour));
			}
			nextHour();
		}
		
		bw.close();
	} // end of main()
	
	static void nextHour() {
		if(!hourglass) {
			curHour++;
		} else {
			curHour--;
		}
		
		if(curHour==0) {
			curHour=12;
		} else if(curHour==13) {
			curHour=1;
		}
	} // end of nextHour()
} // end of Main class