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
		int n = Integer.valueOf(st.nextToken());
		int a = Integer.valueOf(st.nextToken());
		int b = Integer.valueOf(st.nextToken());
		
		boolean min=false, max=false;
		for(int i=0;i<n-1;i++) {
			int tmp = Integer.valueOf(br.readLine());
			if(tmp==a) {
				min=true;
			}
			if(tmp==b) {
				max=true;
			}
		}
		
		if(min&&max) {
			for(int i=a;i<=b;i++) {
				bw.write(i+"\n");
			}
		} else if(min) {
			bw.write(b+"");
		} else if(max) {
			bw.write(a+"");
		} else {
			bw.write("-1");
		}
		
		bw.close();
	} // end of main()
} // end of Main class