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
			int k = Integer.valueOf(st.nextToken());
			int[] arr = new int[k];
			for(int i=0;i<k;i++) {
				arr[i] = Integer.valueOf(st.nextToken());
			}
			
			boolean chk=true;
			for(int i=2;i<k;i++) {
				if(arr[i]!=arr[i-1]+arr[i-2]) {
					chk=false;
					break;
				}
			}
			bw.write(chk?"YES\n":"NO\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class