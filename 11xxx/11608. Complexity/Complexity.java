import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		String string = br.readLine();
		
		int[] chars = new int[26];
		int complexity=0;
		for(int i=0;i<string.length();i++) {
			if(++chars[string.charAt(i)-'a']==1) {
				complexity++;
			}
		}
		Arrays.sort(chars);
		
		int cnt=0;
		for(int i=26-complexity;i<24;i++) {
			cnt += chars[i];
		}
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class