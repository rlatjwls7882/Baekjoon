import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.valueOf(br.readLine());
		
		while(N-->0) {
			String string = br.readLine();

			// 입력받은 문자열에서 사용한 알파벳 종류
			int[] alphabet = new int[26];
			for(int i=0;i<string.length();i++) {
				if('a'<=string.charAt(i)&&string.charAt(i)<='z')
					alphabet[string.charAt(i)-'a']++;
				else if('A'<=string.charAt(i)&&string.charAt(i)<='Z')
					alphabet[string.charAt(i)-'A']++;
			}
			
			// 사용하지 않은 알파벳 확인
			StringBuilder notUsed = new StringBuilder();
			for(int i=0;i<26;i++)
				if(alphabet[i]==0)
					notUsed.append((char)(i+'a'));

			bw.write(notUsed.isEmpty()?"pangram\n":"missing "+notUsed+"\n");
		}
		
		bw.close();
	} // end of main
} // end of Main class