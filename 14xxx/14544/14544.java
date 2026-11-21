import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.valueOf(br.readLine());
		
		for(int numCases=1;numCases<=T;numCases++) {
			
			// 후보자의 수 N, 투표횟수 M
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.valueOf(st.nextToken());
			int M = Integer.valueOf(st.nextToken());
			
			// 후보자 생성
			HashMap<String, Integer> candidate = new HashMap<String, Integer>();
			while(N-->0)
				candidate.put(br.readLine(), 0);
			
			// 각 후보자의 투표수 계산
			while(M-->0) {
				st = new StringTokenizer(br.readLine());
				String name = st.nextToken();
				candidate.put(name, candidate.get(name)+Integer.valueOf(st.nextToken()));
			}
			
			// 승자 확인
			String name="";
			int max=0, num=0;
			
			for(String string:candidate.keySet()) {
				if(candidate.get(string)>max) {
					name=string;
					num=1;
					max=candidate.get(string);
				} else if(candidate.get(string)==max) {
					num=2;
				}
			}
			
			if(num==1)
				bw.write(String.format("VOTE %d: THE WINNER IS %s %d\n", numCases, name, max));
			else
				bw.write(String.format("VOTE %d: THERE IS A DILEMMA\n", numCases));
		}
		
		bw.close();
	} // end of main
} // end of Main class