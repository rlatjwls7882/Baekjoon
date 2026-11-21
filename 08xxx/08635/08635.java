import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int[] chars = new int[52];
		
		int N = Integer.valueOf(br.readLine());
		while(N-->0) {
			String string = br.readLine();
			for(int i=0;i<string.length();i++) {
				if(string.charAt(i)>='a') {
					chars[string.charAt(i)-'a']++;
				} else if(string.charAt(i)>='A') {
					chars[string.charAt(i)-'A'+26]++;
				}
			}
		}
		
		for(int i=0;i<52;i++) {
			if(i<26) {
				if(chars[i]>0) {
					bw.write((char)('a'+i)+" "+chars[i]+"\n");
				}
			} else {
				if(chars[i]>0) {
					bw.write((char)('A'+i-26)+" "+chars[i]+"\n");
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class