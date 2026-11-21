import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 영어 이름의 구성요소 확인
		String string = br.readLine();
		
		int[] alphabet = new int[26];
		for(int i=0;i<string.length();i++)
			alphabet[string.charAt(i)-'A']++;
		
		// 팰린드롬을 만들 수 없는 경우
		int cnt=0;
		for(int i=0;i<26;i++)
			if(alphabet[i]%2==1)
				cnt++;
		
		if(cnt>1) {
			bw.write("I'm Sorry Hansoo");
		}
		
		// 팰린드롬을 만들 수 있는 경우
		else {
			
			// 반복되는 부분
			StringBuilder repeat = new StringBuilder();
			for(int i=0;i<26;i++)
				for(int j=0;j<alphabet[i]/2;j++)
					repeat.append((char)(i+'A'));
			
			// 팰린드롬 출력
			bw.write(repeat.toString());

			if(cnt==1) {
				for(int i=0;i<26;i++)
					if(alphabet[i]%2==1) {
						bw.write((char)(i+'A'));
						break;
					}
			}

			bw.write(repeat.reverse().toString());
		}
		
		bw.close();
	} // end of main()
} // end of Main class