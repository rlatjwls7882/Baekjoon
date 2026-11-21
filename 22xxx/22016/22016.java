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
		int N = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		
		String string = br.readLine();
		
		bw.write(string.substring(0, K-1));
		for(int i=K-1;i<N;i++) {
			if(string.charAt(i)>='a') {
				bw.write(string.charAt(i)-32);
			} else {
				bw.write(string.charAt(i)+32);
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class