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
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[20];
			for(int i=0;i<20;i++) {
				arr[i] = Integer.valueOf(st.nextToken());
			}
			
			for(int i=0;i<19;i++) {
				for(int j=1;j<20;j++) {
					if(arr[j]>=2) {
						arr[j-1] += arr[j]/2;
					}
					arr[j]%=2;
				}
			}
			
			for(int i=0;i<20;i++) {
				bw.write(arr[i]+" ");
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class