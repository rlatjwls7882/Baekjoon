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
			String string = br.readLine().toLowerCase();
			
			// 자음과 모음의 개수 계산
			int consonant=0, vowel=0;
			for(int i=0;i<string.length();i++) {
				if(string.charAt(i)=='a'||string.charAt(i)=='i'||string.charAt(i)=='u'||string.charAt(i)=='e'||string.charAt(i)=='o')
					vowel++;
				else if(string.charAt(i)!=' ')
					consonant++;
			}
			
			bw.write(consonant+" "+vowel+"\n");
		}
		
		bw.close();
	} // end of main
} // end of Main class