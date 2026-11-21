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
		
		// 음식의 가격 k, 지폐의 수 n
		int k = Integer.valueOf(br.readLine());
		int n = Integer.valueOf(br.readLine());
		
		// 지폐의 합과 최솟값 계산
		int sum=0, min=1000;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(n-->0) {
			int tmp = Integer.valueOf(st.nextToken());
			sum += tmp;
			min = Math.min(min, tmp);
		}
		
		// 하나의 지폐를 뺏을 때 k보다 작아지는 경우가 있는지 확인
		if(sum-min<k) {
			bw.write("NO");
		} else {
			bw.write("YES");
		}
		
		bw.close();
	} // end of main()
} // end of Main class