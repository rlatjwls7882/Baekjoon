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
		
		boolean[] work = new boolean[26];
		int[] penalty = new int[26];
		int correct=0, penaltySum=0;
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), ": ");
			int t = Integer.valueOf(st.nextToken())*60+Integer.valueOf(st.nextToken());
			int idx = st.nextToken().charAt(0)-'A';
			String V = st.nextToken();
			
			if(!work[idx]) {
				if(V.equals("OK")) {
					penaltySum += t+penalty[idx]*20;
					work[idx]=true;
					correct++;
				} else if(!V.equals("CE")) {
					penalty[idx]++;
				}
			}
		}
		bw.write(correct+" "+penaltySum);
		
		bw.close();
	} // end of main()
} // end of Main class