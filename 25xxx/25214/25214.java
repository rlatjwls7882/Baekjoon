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
		
		// 초기값
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max=0, Ai=Integer.valueOf(st.nextToken());
		bw.write("0 ");
		
		// 각각의 Aj - Ai의 최댓값 계산
		while(N-->1) {
			int Aj = Integer.valueOf(st.nextToken());
			
			max = Math.max(max, Aj-Ai);
			Ai = Math.min(Ai, Aj);
			
			bw.write(Integer.toString(max));
			bw.write(' ');
		}
		
		bw.close();
	} // end of main()
} // end of Main class