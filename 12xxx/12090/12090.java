import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		char[] hangeul = {'까', '나', '다', '따', '라', '마', '바', '빠', '사', '싸', '아', '자', '짜', '차', '카', '타', '파', '하'};
		char[] initial_sound = {'ㄱ', 'ㄲ', 'ㄴ', 'ㄷ', 'ㄸ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅃ', 'ㅅ', 'ㅆ', 'ㅇ', 'ㅈ', 'ㅉ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ'};
		
		// S를 초성으로 출력
		String S = br.readLine();
		
		for(int i=0;i<S.length();i++) {
			for(int j=0;j<18;j++) {
				if(S.charAt(i)<hangeul[j]) {
					bw.write(initial_sound[j]);
					break;
				}
			}
			
			if(S.charAt(i)>=hangeul[17]) {
				bw.write('ㅎ');
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class