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
			
			// 문장에서 나타나는 알파벳 확인
			int[] alphabet = new int[26];
			for(int i=0;i<string.length();i++)
				if(string.charAt(i)>='a')
					alphabet[string.charAt(i)-'a']++;
			
			// 가장 빈번하게 나타나는 문자 확인
			int max=0, cnt=0, index=0;
			for(int i=0;i<26;i++) {
				if(max<alphabet[i]) {
					max = alphabet[i];
					index=i;
					cnt=1;
				} else if(max==alphabet[i]) {
					cnt++;
				}
			}
			
			if(cnt==1) bw.write((char)(index+'a')+"\n");
			else bw.write("?\n");
		}
		
		bw.close();
	} // end of main
} // end of Main class