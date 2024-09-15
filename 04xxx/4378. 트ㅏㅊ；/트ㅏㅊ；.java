import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		String word = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
		
		// 오류를 고쳐 출력
		for(int lineNum=1;;lineNum++) {
			String string = br.readLine();
			if(string==null) {
				break;
			}
			
			if(lineNum!=1) {
				bw.newLine();
			}
			
			for(int i=0;i<string.length();i++) {
				if(string.charAt(i)==' ') {
					bw.write(' ');
				} else {
					for(int j=1;j<word.length();j++) {
						if(string.charAt(i)==word.charAt(j)) {
							bw.write(word.charAt(j-1));
							break;
						}
					}
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class