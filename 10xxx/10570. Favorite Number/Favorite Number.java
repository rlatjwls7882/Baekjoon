import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			
			// 쪽지에서 가장 많이 선택된 수 출력
			int V = Integer.valueOf(br.readLine());
			
			int[] S = new int[1001];
			int max=0, maxIdx=1;
			while(V-->0) {
				int idx = Integer.valueOf(br.readLine());
				S[idx]++;
				if(max<S[idx]||max==S[idx]&&idx<maxIdx) {
					max=S[idx];
					maxIdx=idx;
				}
			}
			
			bw.write(Integer.toString(maxIdx));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class