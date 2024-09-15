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
		int p = Integer.valueOf(st.nextToken());
		
		int move = Math.min(p-1, n-p)+n-1;
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			move += Integer.valueOf(st.nextToken());
		}
		bw.write(move+"");
		
		bw.close();
	} // end of main()
} // end of Main class