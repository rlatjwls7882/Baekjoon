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
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		
		int[] length = new int[N];
		Arrays.fill(length, 1);
		for(int i=1;i<N;i++) {
			if(arr[i-1]<arr[i]) {
				length[i] = length[i-1]+1;
			}
		}
		
		long cnt=0;
		for(int i=0;i<N;i++) {
			if(i+1>=N||length[i]>=length[i+1]) {
				cnt += (long)length[i]*(length[i]+1)/2;
			}
		}
		bw.write(Long.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class