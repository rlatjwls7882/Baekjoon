import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.valueOf(br.readLine());
		
		for(int numCases=1;numCases<=T;numCases++) {
			
			// G명 초대
			int G = Integer.valueOf(br.readLine());
			HashSet<Integer> set = new HashSet<>();
			
			// 혼자 온 사람 확인
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(G-->0) {
				int C = Integer.valueOf(st.nextToken());
				if(set.contains(C)) set.remove(C);
				else set.add(C);
			}
			
			bw.write(String.format("Case #%d: %d\n", numCases, set.iterator().next()));
		}
		
		bw.close();
	} // end of main
} // end of Main class