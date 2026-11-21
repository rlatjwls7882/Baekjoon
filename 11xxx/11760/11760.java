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
		int n = Integer.valueOf(st.nextToken());
		String str1 = st.nextToken();
		String str2 = st.nextToken();
		
		int r=0;
		int[] chars1 = new int[26];
		int[] chars2 = new int[26];
		for(int i=0;i<n;i++) {
			if(str1.charAt(i)==str2.charAt(i)) {
				r++;
			} else {
				chars1[str1.charAt(i)-'A']++;
				chars2[str2.charAt(i)-'A']++;
			}
		}
		
		int s=0;
		for(int i=0;i<26;i++) {
			s += Math.min(chars1[i], chars2[i]);
		}
		bw.write(r+" "+s);
		
		bw.close();
	} // end of main()
} // end of Main class