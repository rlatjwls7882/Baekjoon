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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.valueOf(st.nextToken());
		int w = Integer.valueOf(st.nextToken());
		int n = Integer.valueOf(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int sum=0;
		while(n-->0) {
			sum += Integer.valueOf(st.nextToken());
			if(sum>w) {
				break;
			} else if(sum==w) {
				h--;
				if(h==0) {
					break;
				}
				sum=0;
			}
		}
		
		if(h==0) {
			bw.write("YES");
		} else {
			bw.write("NO");
		}
		
		bw.close();
	} // end of main()
} // end of Main class