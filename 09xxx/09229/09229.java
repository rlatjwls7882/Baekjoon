import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int cnt=0;
	
	public static void main(String[] args) throws IOException {
		
		while(true) {
			String lastString = br.readLine();
			if(lastString.equals("#")) {
				break;
			}
			
			// 단어 사다리가 가능한지 확인
			boolean radder=true;
			
			while(true) {
				String curString = br.readLine();
				if(curString.equals("#")) {
					break;
				}
				
				if(!radder) {
					continue;
				}
				
				if(!isRadder(lastString, curString)) {
					radder=false;
				}
				lastString=curString;
			}
			
			// 출력
			if(radder) {
				bw.write("Correct\n");
			} else {
				bw.write("Incorrect\n");
			}
		}
		
		bw.close();
	} // end of main()
	
	static boolean isRadder(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		
		int cnt=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				cnt++;
			}
		}
		
		if(cnt!=1) {
			return false;
		} else {
			return true;
		}
	} // end of isRadder()
} // end of Main class