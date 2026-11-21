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
		
		int N = Integer.valueOf(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		
		for(int i=N-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				arr[j]=Math.abs(arr[j]-arr[j+1]);
			}
		}
		bw.write(Integer.toString(arr[0]));
		
		bw.close();
	} // end of main()
} // end of Main class