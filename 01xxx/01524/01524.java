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
			br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.valueOf(st.nextToken());
			int M = Integer.valueOf(st.nextToken());
			
			// 세준의 병사
			st = new StringTokenizer(br.readLine());
			int MaxSejun=0;
			while(N-->0) {
				MaxSejun = Math.max(MaxSejun, Integer.valueOf(st.nextToken()));
			}
			
			// 세비의 병사
			st = new StringTokenizer(br.readLine());
			int MaxSeby=0;
			while(M-->0) {
				MaxSeby = Math.max(MaxSeby, Integer.valueOf(st.nextToken()));
			}
			
			// 누가 이기는지 확인
			if(MaxSejun>=MaxSeby) {
				bw.write("S\n");
			} else {
				bw.write("B\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class