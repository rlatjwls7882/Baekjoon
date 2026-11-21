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
		
		int dir=0;
		while(N-->1) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			st.nextToken();
			st.nextToken();
			dir += Integer.valueOf(st.nextToken());
		}
		bw.write(Integer.toString(dir%2));
		
		bw.close();
	} // end of main()
} // end of Main class