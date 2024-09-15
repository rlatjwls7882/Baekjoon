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
			
			if(n==0&&m==0) {
				break;
			}
			
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = Integer.valueOf(st.nextToken());
			}
			
			int max=0;
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					if(arr[i]+arr[j]<=m) {
						max = Math.max(max, arr[i]+arr[j]);
					}
				}
			}
			if(max==0) {
				bw.write("NONE\n");
			} else {
				bw.write(max+"\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class