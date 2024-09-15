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
		
		while(true) {
			int N = Integer.valueOf(br.readLine());
			if(N==0) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] a = new int[N];
			for(int i=0;i<N;i++) {
				a[i] = Integer.valueOf(st.nextToken());
			}
			Arrays.sort(a);
			
			int curL=1, maxL=1;
			for(int i=1;i<N;i++) {
				if(a[i]==a[i-1]+1) {
					curL++;
					maxL = Math.max(maxL, curL);
				} else {
					curL=1;
				}
			}
			bw.write(maxL+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class