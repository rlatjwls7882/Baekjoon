import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			int n = Integer.valueOf(br.readLine());
			
			// 시작 카드
			StringTokenizer st = new StringTokenizer(br.readLine());
			String[] start = new String[n];
			for(int i=0;i<n;i++) {
				start[i] = st.nextToken();
			}
			Arrays.sort(start);
			
			// 끝 카드
			st = new StringTokenizer(br.readLine());
			String[] end = new String[n];
			for(int i=0;i<n;i++) {
				end[i] = st.nextToken();
			}
			Arrays.sort(end);
			
			// 돌고래가 카드를 바꿔치기 했는지 확인
			if(Arrays.equals(start, end)) {
				bw.write("NOT CHEATER\n");
			} else {
				bw.write("CHEATER\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class