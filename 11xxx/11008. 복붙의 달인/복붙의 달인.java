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
		
		int T = Integer.valueOf(br.readLine());
		
		// s를 타이핑할 때 걸리는 시간 계산
		while(T-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			String p = st.nextToken();
			
			bw.write(Integer.toString(s.replace(p, "0").length()));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class