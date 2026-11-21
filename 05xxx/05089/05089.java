import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for(int numCases=1;;numCases++) {
			
			// 도시의 개수 N
			int N = Integer.valueOf(br.readLine());
			if(N==0) break;
			
			// 중복되지 않은 도시의 수 확인
			HashSet<String> set = new HashSet<>();
			while(N-->0)
				set.add(br.readLine());
			
			bw.write(String.format("Week %d %d\n", numCases, set.size()));
		}
		
		bw.close();
	} // end of main
} // end of Main class