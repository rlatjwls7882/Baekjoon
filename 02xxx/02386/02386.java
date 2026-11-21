import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			
			// 문장과 찾을 문자 입력
			String sentence = br.readLine();
			char lowChar = sentence.charAt(0);
			if(lowChar=='#') break;
			
			// 문자가 나타난 횟수 계산
			int cnt=0;
			for(int i=2;i<sentence.length();i++)
				if(sentence.charAt(i)==lowChar||sentence.charAt(i)==lowChar-32)
					cnt++;
			
			bw.write(lowChar+" "+cnt+"\n");
		}

		bw.close();
	} // end of main
} // end of Main class