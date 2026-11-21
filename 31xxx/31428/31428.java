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
		String[] chars = new String[N];
		for(int i=0;i<N;i++) {
			chars[i] = st.nextToken();
		}
		
		String string = br.readLine();
		
		int cnt=0;
		for(int i=0;i<N;i++) {
			if(string.equals(chars[i])) {
				cnt++;
			}
		}
		bw.write(cnt+"");
		
		bw.close();
	} // end of main()
} // end of Main class