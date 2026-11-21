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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		int k = Integer.valueOf(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		long sum=0;
		int[] size = new int[n];
		for(int i=0;i<n;i++) {
			size[i] = Integer.valueOf(st.nextToken());
			sum += size[i];
		}
		Arrays.sort(size);
		
		long max=sum;
		for(int i=0;i<n-m-k;i++) {
			max-=size[i];
		}
		bw.write(100.*max/sum+"");
		
		bw.close();
	} // end of main()
} // end of Main class