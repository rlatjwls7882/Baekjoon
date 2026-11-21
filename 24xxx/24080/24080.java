import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		String string = br.readLine();
		
		boolean[] chars = new boolean[26];
		int cnt=0;
		for(int i=0;i<N;i++) {
			if(!chars[string.charAt(i)-'A']) {
				chars[string.charAt(i)-'A']=true;
				cnt++;
			}
		}
		bw.write(cnt>=3?"Yes":"No");
		
		bw.close();
	} // end of main()
} // end of Main class