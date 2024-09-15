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
		int before = Integer.valueOf(st.nextToken());
		boolean check=true;
		for(int i=1;i<N;i++) {
			int cur = Integer.valueOf(st.nextToken());
			if(before>cur) {
				check=false;
				break;
			}
			before=cur;
		}
		bw.write(check?"yes":"no");
		
		bw.close();
	} // end of main()
} // end of Main class