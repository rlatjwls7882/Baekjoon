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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] score1 = new int[N+1];
		for(int i=1;i<=N;i++) {
			score1[i] = score1[i-1] + Integer.valueOf(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		int[] score2 = new int[N+1];
		for(int i=1;i<=N;i++) {
			score2[i] = score2[i-1] + Integer.valueOf(st.nextToken());
		}
		
		for(int i=N;i>=0;i--) {
			if(score1[i]==score2[i]) {
				bw.write(Integer.toString(i));
				break;
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class