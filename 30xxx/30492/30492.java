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
		int m = Integer.valueOf(st.nextToken());
		
		String[] strings = new String[n];
		for(int i=0;i<n;i++) {
			strings[i] = br.readLine();
		}
		
		for(int i=0;i<m;i++) {
			int[] chars = new int[26];
			for(int j=0;j<n;j++) {
				chars[strings[j].charAt(i)-'a']++;
			}
			
			int max=0, maxIdx=0;
			for(int j=0;j<26;j++) {
				if(max<chars[j]) {
					max=chars[j];
					maxIdx=j;
				}
			}
			bw.write(maxIdx+'a');
		}
		
		bw.close();
	} // end of main()
} // end of Main class