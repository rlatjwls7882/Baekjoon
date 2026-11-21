import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int n = Integer.valueOf(br.readLine());
		while(n-->0) {
			String string = br.readLine().toLowerCase();
			
			int[] chars = new int[26];
			for(int i=0;i<string.length();i++) {
				if('a'<=string.charAt(i)&&string.charAt(i)<='z') {
					chars[string.charAt(i)-'a']++;
				}
			}
			
			boolean chk=true;
			for(int i=0;i<13;i++) {
				if(chars[i]!=chars[25-i]) {
					chk=false;
					break;
				}
			}
			
			if(chk) {
				bw.write("Yes\n");
			} else {
				bw.write("No\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class