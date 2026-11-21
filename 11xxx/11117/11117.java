import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		int T = Integer.valueOf(br.readLine());
		while(T-->0) {
			int[] chars = new int[26];
			String string = br.readLine();
			for(int i=0;i<string.length();i++) {
				chars[string.charAt(i)-'A']++;
			}

			int W = Integer.valueOf(br.readLine());
			while(W-->0) {
				string = br.readLine();
				int[] wantMake = new int[26];
				for(int i=0;i<string.length();i++) {
					wantMake[string.charAt(i)-'A']++;
				}

				boolean chk=true;
				for(int i=0;i<26;i++) {
					if(wantMake[i]>chars[i]) {
						chk=false;
						break;
					}
				}
				bw.write(chk?"YES\n":"NO\n");
			}
		}

		bw.close();
	} // end of main()
} // end of Main class