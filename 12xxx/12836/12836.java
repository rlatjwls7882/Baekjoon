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
		
		// 일 수 N, 쿼리의 개수 Q
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 쿼리 수행
		long[] money = new long[N+1];
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			if(st.nextToken().equals("1")) {
				money[Integer.valueOf(st.nextToken())] += Long.valueOf(st.nextToken());
			} else {
				int p = Integer.valueOf(st.nextToken());
				int q = Integer.valueOf(st.nextToken());
				
				long change=0;
				while(p<=q) {
					change += money[p++];
				}
				
				bw.write(Long.toString(change));
				bw.newLine();
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class