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
		
		// 구매하려고 하는 카드의 개수 N
		int N = Integer.valueOf(br.readLine());
		
		// 카드팩의 가격 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] card = new int[N+1];
		for(int i=1;i<=N;i++) {
			card[i] = Integer.valueOf(st.nextToken());
		}
		
		// 카드 N개를 갖기 위해 지불해야 하는 금액의 최댓값 계산
		for(int i=2;i<=N;i++) {
			for(int j=1;j<i;j++) {
				card[i] = Math.max(card[i], card[j]+card[i-j]);
			}
		}
		
		bw.write(Integer.toString(card[N]));
		
		bw.close();
	} // end of main()
} // end of Main class