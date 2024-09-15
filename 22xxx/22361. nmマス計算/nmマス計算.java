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
			int N = Integer.valueOf(st.nextToken());
			int M = Integer.valueOf(st.nextToken());
			if(N==0&&M==0) {
				break;
			}
			
			int[] a = new int[N];
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<N;i++) {
				a[i] = Integer.valueOf(st.nextToken());
			}
			
			int[] b = new int[M];
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<M;i++) {
				b[i] = Integer.valueOf(st.nextToken());
			}
			
			int[] nums = new int[10];
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					int mult = a[i]*b[j];
					while(mult!=0) {
						nums[mult%10]++;
						mult/=10;
					}
				}
			}
			
			for(int i=0;i<10;i++) {
				bw.write(nums[i]+" ");
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class