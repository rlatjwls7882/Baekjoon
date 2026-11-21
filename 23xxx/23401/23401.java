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
		
		int n = Integer.valueOf(br.readLine());
		
		int[] lastSprayedTime = new int[9];
		Arrays.fill(lastSprayedTime, -20);
		
		int score1=0, score2=0;
		while(n-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int t = Integer.valueOf(st.nextToken());
			int a = Integer.valueOf(st.nextToken());
			
			if(a<=4) {
				score1 += 100;
				if(lastSprayedTime[a]>=t-10) {
					score1 += 50;
				}
			} else {
				score2 += 100;
				if(lastSprayedTime[a]>=t-10) {
					score2 += 50;
				}
			}
			lastSprayedTime[a]=t;
		}
		bw.write(score1+" "+score2);
		
		bw.close();
	} // end of main()
} // end of Main class