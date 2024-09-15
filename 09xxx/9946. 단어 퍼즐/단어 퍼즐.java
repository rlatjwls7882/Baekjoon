import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 두 단어의 구성요소가 같은지 확인
		for(int i=1;;i++) {
			String s1 = br.readLine();
			String s2 = br.readLine();
			if(s1.equals("END")&&s2.equals("END")) {
				break;
			}
			
			if(isSame(s1, s2)) {
				bw.write(String.format("Case %d: same\n", i));
			} else {
				bw.write(String.format("Case %d: different\n", i));
			}
		}
		
		bw.close();
	} // end of main()

	static boolean isSame(String s1, String s2) {
		int[] element = new int[26];
		for(int i=0;i<s1.length();i++) {
			element[s1.charAt(i)-'a']++;
		}
		
		for(int i=0;i<s2.length();i++) {
			if(element[s2.charAt(i)-'a']--==0) {
				return false;
			}
		}
		
		return true;
	} // end of isSame()
} // end of Main class