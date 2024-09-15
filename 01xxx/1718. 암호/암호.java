import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 평문과 암호화 키 입력
		String string = br.readLine();
		String code = br.readLine();
		
		// 암호문 출력
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)==' ') bw.write(" ");
			else {
				int pos = string.charAt(i)-(code.charAt(i%code.length())-'a'+1);
				if(pos<'a') pos+=26;
				bw.write(pos);
			}
		}
		
		bw.close();
	} // end of main
} // end of Main class