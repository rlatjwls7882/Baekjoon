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
		
		// 모든 교통편의 요금
		int[] cost = new int[N];
		int jinjuCost=0;
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String D = st.nextToken();
			cost[i] = Integer.valueOf(st.nextToken());
			
			if(D.equals("jinju")) {
				jinjuCost=cost[i];
			}
		}
		
		// 진주로 가는 교통편보다 비싼 교통편의 수 계산
		int cnt=0;
		for(int i=0;i<N;i++) {
			if(cost[i]>jinjuCost) {
				cnt++;
			}
		}
		
		// 출력
		bw.write(Integer.toString(jinjuCost));
		bw.newLine();
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class