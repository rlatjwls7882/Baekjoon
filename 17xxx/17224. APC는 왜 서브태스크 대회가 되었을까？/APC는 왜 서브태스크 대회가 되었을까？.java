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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int L = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		
		// 얻을 수 있는 점수의 최댓값 계산
		int solved_easy=0, solved_hard=0;
		while(N-->0) {
			st = new StringTokenizer(br.readLine());
			int easy = Integer.valueOf(st.nextToken());
			int hard = Integer.valueOf(st.nextToken());
			
			if(solved_hard==K) {
				break;
			} else if(hard<=L) {
				if(solved_easy+solved_hard==K) {
					solved_easy--;
				}
				solved_hard++;
			} else if(easy<=L) {
				if(solved_easy+solved_hard==K) {
					continue;
				}
				solved_easy++;
			}
		}
		
		bw.write(Integer.toString(solved_hard*140+solved_easy*100));
		
		bw.close();
	} // end of main()
} // end of Main class