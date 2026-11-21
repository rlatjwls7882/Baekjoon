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
			int N = Integer.valueOf(br.readLine());
			if(N==0) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] a = new int[N];
			double average=0;
			for(int i=0;i<N;i++) {
				a[i] = Integer.valueOf(st.nextToken());
				average += a[i];
			}
			average /= N;
			
			int cnt=0;
			for(int i=0;i<N;i++) {
				if(a[i]<=average) {
					cnt++;
				}
			}
			bw.write(cnt+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class