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
		
		for(int i=1;;i++) {
			int N = Integer.valueOf(br.readLine());
			if(N==0) {
				break;
			}
			
			int sum=0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] height = new int[N];
			
			for(int j=0;j<N;j++) {
				height[j] = Integer.valueOf(st.nextToken());
				sum += height[j];
			}
			sum /= N;
			
			int cnt=0;
			for(int j=0;j<N;j++) {
				cnt += Math.abs(sum-height[j]);
			}
			
			bw.write(String.format("Set #%d\nThe minimum number of moves is %d.\n\n", i, cnt/2));
		}
		
		bw.close();
	} // end of main()
} // end of Main class