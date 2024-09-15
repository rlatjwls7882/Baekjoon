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
		
		// 참가자의 수 N, 예산 B, 호텔의 수 H, 고를 수 있는 주의 수 W
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		int H = Integer.valueOf(st.nextToken());
		int W = Integer.valueOf(st.nextToken());
		
		// 대회를 개최하는데 드는 최소비용 계산
		int minCost=1_000_000_000;
		
		while(H-->0) {
			int cost = Integer.valueOf(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			for(int i=0;i<W;i++) {
				if(Integer.valueOf(st.nextToken())>=N) {
					minCost = Math.min(minCost, cost*N);
					break;
				}
			}
		}
		
		// 출력
		if(minCost>=B) {
			bw.write("stay home");
		} else {
			bw.write(Integer.toString(minCost));
		}
		
		bw.close();
	} // end of main()
} // end of Main class