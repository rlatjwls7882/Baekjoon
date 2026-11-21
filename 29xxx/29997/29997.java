import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		char[] string = br.readLine().toCharArray();
		int K = Integer.valueOf(br.readLine());
		
		int[][] list = new int[K][26];
		for(int i=0;i<K;i++) {
			for(int j=i;j<string.length;j+=K) {
				list[i][string[j]-'a']++;
			}
		}
		
		int cnt=0;
		int[] idx = new int[K];
		while(cnt<string.length) {
			for(int i=0;i<K;i++) {
				while(idx[i]<26&&list[i][idx[i]]==0) {
					idx[i]++;
				}
				if(idx[i]<26) {
					list[i][idx[i]]--;
					cnt++;
					bw.write(idx[i]+'a');
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class