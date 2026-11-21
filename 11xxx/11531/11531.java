import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 해결한 문제 수와 페널티 계산
		int solve=0, penalty=0;
		HashMap<String, Integer> wrongList = new HashMap<>();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int submit_time = Integer.valueOf(st.nextToken());
			if(submit_time==-1) {
				break;
			}
			
			String name = st.nextToken();
			String res = st.nextToken();
			
			if(res.equals("right")) {
				solve++;
				penalty += submit_time + wrongList.getOrDefault(name, 0);
			} else {
				wrongList.put(name, wrongList.getOrDefault(name, 0)+20);
			}
		}
		
		bw.write(Integer.toString(solve));
		bw.write(' ');
		bw.write(Integer.toString(penalty));
		
		bw.close();
	} // end of main()
} // end of Main class