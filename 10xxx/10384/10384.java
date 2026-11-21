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
		
		for(int i=1;i<=T;i++) {
			String string = br.readLine().toLowerCase();
			
			// 가장 적게 나온 알파벳의 개수 계산
			int[] alpha = new int[26];
			for(int j=0;j<string.length();j++) {
				if(string.charAt(j)-'a'>=0) {
					alpha[string.charAt(j)-'a']++;
				}
			}
			
			int min=3;
			for(int j=0;j<26;j++) {
				min = Math.min(min, alpha[j]);
			}
			
			// 출력
			if(min>=3) {
				bw.write(String.format("Case %d: Triple pangram!!!\n", i));
			} else if(min>=2) {
				bw.write(String.format("Case %d: Double pangram!!\n", i));
			} else if(min>=1) {
				bw.write(String.format("Case %d: Pangram!\n", i));
			} else {
				bw.write(String.format("Case %d: Not a pangram\n", i));
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class