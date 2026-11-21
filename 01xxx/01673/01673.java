import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			try {
				// 치킨 쿠폰의 개수 n, 치킨 한마리 교환할 때 필요한 쿠폰의 수 k
				StringTokenizer st = new StringTokenizer(br.readLine());
				int n = Integer.valueOf(st.nextToken());
				int k = Integer.valueOf(st.nextToken());
				
				// 먹을 수 있는 치킨의 수 계산
				int totalChicken = n;
				while (n/k!=0) {
					int tmp = n/k;
					totalChicken += tmp;
					n = n%k+tmp;
				}
				
				bw.write(totalChicken+"\n");
			} catch (Exception e) { break; }
		}

		bw.close();
	} // end of main
} // end of Main class