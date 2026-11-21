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
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			int n = Integer.valueOf(br.readLine());
			
			int[] tape = new int[1001];
			while(n-->0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				st.nextToken();
				int a = Integer.valueOf(st.nextToken());
				int b = Integer.valueOf(st.nextToken());
				while(a<b) {
					tape[a]++;
					a++;
				}
			}
			
			for(int i=0;i<=1000;i++) {
				if(tape[i]>0) {
					bw.write('A'+tape[i]-1);
				}
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class