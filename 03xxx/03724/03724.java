import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.valueOf(st.nextToken());
			int M = Integer.valueOf(st.nextToken());
			
			BigInteger[] arr = new BigInteger[N];
			for(int i=0;i<N;i++) {
				arr[i] = BigInteger.ONE;
			}
			
			while(M-->0) {
				st = new StringTokenizer(br.readLine());
				for(int i=0;i<N;i++) {
					arr[i] = arr[i].multiply(new BigInteger(st.nextToken()));
				}
			}
			
			int idx=1;
			BigInteger max=arr[0];
			for(int i=1;i<N;i++) {
				if(max.compareTo(arr[i])<=0) {
					max=arr[i];
					idx=i+1;
				}
			}
			bw.write(idx+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class