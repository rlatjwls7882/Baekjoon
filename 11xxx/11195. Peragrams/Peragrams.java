import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int[] chars = new int[26];
		String string = br.readLine();
		for(int i=0;i<string.length();i++) {
			chars[string.charAt(i)-'a']++;
		}
		
		int cnt=0;
		for(int i=0;i<26;i++) {
			if(chars[i]%2==1) {
				cnt++;
			}
		}
		bw.write(Integer.toString(Math.max(0, cnt-1)));
		
		bw.close();
	} // end of main()
} // end of Main class