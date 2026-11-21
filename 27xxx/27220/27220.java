import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int n = Integer.valueOf(br.readLine());
		int a = Integer.valueOf(br.readLine());
		int b = Integer.valueOf(br.readLine());
		
		int midX=(n+1)/2, midY=(n+1)/2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				int dist = Math.abs(i-midX)+Math.abs(j-midY);
				if(a<=dist&&dist<=b) {
					bw.write('*');
				} else {
					bw.write('.');
				}
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class