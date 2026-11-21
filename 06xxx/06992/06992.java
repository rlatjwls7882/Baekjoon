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
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.valueOf(st.nextToken());
			
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = Integer.valueOf(st.nextToken());
			}
			int d = arr[1]-arr[0];
			
			boolean chk=true;
			for(int i=2;i<n;i++) {
				if(arr[i]-arr[i-1]!=d) {
					chk=false;
					break;
				}
			}
			
			if(chk) {
				bw.write("The next 5 numbers after ["+arr[0]);
				for(int i=1;i<n;i++) {
					bw.write(","+" "+arr[i]);
				}
				
				bw.write("] are: ["+(arr[n-1]+d));
				for(int i=2;i<=5;i++) {
					bw.write(","+" "+(arr[n-1]+i*d));
				}
				bw.write("]\n");
			} else {
				bw.write("The sequence ["+arr[0]);
				for(int i=1;i<n;i++) {
					bw.write(","+" "+arr[i]);
				}
				bw.write("] is not an arithmetic sequence.\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class