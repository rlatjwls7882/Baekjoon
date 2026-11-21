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
		
		int N = Integer.valueOf(br.readLine());
		
		// 돌림판에 최대로 붙어있는 스티커의 개수 계산
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] menu = new int[N];
		int maxCnt=1, cnt=0;
		
		for(int i=0;i<2*N;i++) {
			int idx = Integer.valueOf(st.nextToken())-1;
			menu[idx]++;
			if(menu[idx]==1) {
				cnt++;
			} else {
				cnt--;
			}
			maxCnt = Math.max(maxCnt, cnt);
		}
		
		bw.write(Integer.toString(maxCnt));
		
		bw.close();
	} // end of main()
} // end of Main class