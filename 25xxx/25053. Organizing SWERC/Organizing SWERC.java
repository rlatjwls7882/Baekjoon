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
		
		int t = Integer.valueOf(br.readLine());
		
		while(t-->0) {
			int N = Integer.valueOf(br.readLine());
			
			int[] score = new int[10];
			while(N-->0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int beauty = Integer.valueOf(st.nextToken());
				int difficulty = Integer.valueOf(st.nextToken())-1;
				score[difficulty] = Math.max(score[difficulty], beauty);
			}
			
			int sum=0, cnt=0;
			for(int i=0;i<10;i++) {
				if(score[i]!=0) {
					sum += score[i];
					cnt++;
				}
			}
			
			if(cnt==10) {
				bw.write(sum+"\n");
			} else {
				bw.write("MOREPROBLEMS\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class