import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		StringBuilder sb = new StringBuilder();
		int N = Integer.valueOf(br.readLine());
		
		for(int cases=1;cases<=N;cases++) {
			String word1 = br.readLine();
			String word2 = br.readLine();
			
			// 두 단어의 구성요소 확인
			int[] chars = new int[26];
			for(int i=0;i<word1.length();i++) {
				chars[word1.charAt(i)-'a']++;
			}
			
			for(int i=0;i<word2.length();i++) {
				chars[word2.charAt(i)-'a']--;
			}
			
			// 두 단어의 애너그램 거리 확인
			int dist=0;
			for(int i=0;i<26;i++) {
				dist += Math.abs(chars[i]);
			}
			
			sb.append("Case #").append(cases).append(": ").append(dist).append('\n');
		}
		
		bw.write(sb.toString());
		
		bw.close();
	} // end of main()
} // end of Main class