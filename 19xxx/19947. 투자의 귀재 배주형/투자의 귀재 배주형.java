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
		
		// 초기비용 H, 투자 기간 Y
		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.valueOf(st.nextToken());
		int Y = Integer.valueOf(st.nextToken());
		
		// Y년까지의 각 년도의 최대 자산 계산
		int[] money = new int[Y+1];
		money[0]=H;
		
		for(int i=1;i<=Y;i++) {
			if(i>=5) {
				money[i] = money[i-5]*135/100;
			}
			if(i>=3) {
				money[i] = Math.max(money[i], money[i-3]*12/10);
			}
			money[i] = Math.max(money[i], money[i-1]*105/100);
		}
		
		// Y년도의 최대 자산 출력
		bw.write(Integer.toString(money[Y]));
		
		bw.close();
	} // end of main()
} // end of Main class