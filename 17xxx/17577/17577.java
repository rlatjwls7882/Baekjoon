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

		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.valueOf(st.nextToken());
			int m = Integer.valueOf(st.nextToken());
			if(n==0) {
				break;
			}
			
			int[] score = new int[n];
			while(m-->0) {
				st = new StringTokenizer(br.readLine());
				for(int i=0;i<n;i++) {
					score[i] += Integer.valueOf(st.nextToken());
				}
			}
			
			int max=0;
			for(int i=0;i<n;i++) {
				max = Math.max(max, score[i]);
			}
			bw.write(max+"\n");
		}

		bw.close();
	} // end of main()
} // end of Main class