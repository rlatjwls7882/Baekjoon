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
		
		int N = Integer.valueOf(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] a = new int[N];
		for(int i=0;i<N;i++) {
			a[i] = Integer.valueOf(st.nextToken());
		}
		Arrays.sort(a);
		
		for(int i=0;i<N;i+=2) {
			if(i+1<N) {
				bw.write(a[i+1]+" ");
			}
			bw.write(a[i]+" ");
		}
		
		bw.close();
	} // end of main()
} // end of Main class