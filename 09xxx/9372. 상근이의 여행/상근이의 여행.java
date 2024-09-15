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
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			
			// 국가의 수 N
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.valueOf(st.nextToken());
			
			int M = Integer.valueOf(st.nextToken());
			while(M-->0) {
				br.readLine();
			}
			
			// 모든 국가를 여행하기 위해 타야하는 비행기 종류의 최소 개수 계산
			bw.write(Integer.toString(N-1));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class