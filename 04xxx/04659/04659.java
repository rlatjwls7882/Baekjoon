import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static HashSet<Character> vowel = new HashSet<>();
	
	public static void main(String[] args) throws IOException {
		
		// 모음 목록
		vowel.add('a');
		vowel.add('e');
		vowel.add('i');
		vowel.add('o');
		vowel.add('u');
		
		// 패스워드 평가
		while(true) {
			String string = br.readLine();
			if(string.equals("end")) {
				break;
			}
			
			if(evaluate(string)) {
				bw.write(String.format("<%s> is acceptable.\n", string));
			} else {
				bw.write(String.format("<%s> is not acceptable.\n", string));
			}
		}
		
		bw.close();
	} // end of main()
	
	static boolean evaluate(String string) {
		int length = string.length();
		boolean vowel_exist=false;
		
		for(int i=0;i<length;i++) {
			if(i+2<length&&(vowel.contains(string.charAt(i))&&vowel.contains(string.charAt(i+1))&&vowel.contains(string.charAt(i+2))||(!vowel.contains(string.charAt(i))&&!vowel.contains(string.charAt(i+1))&&!vowel.contains(string.charAt(i+2))))) {
				return false;
			}
			if(i+1<length&&string.charAt(i)!='e'&&string.charAt(i+1)!='e'&&string.charAt(i)!='o'&&string.charAt(i+1)!='o'&&string.charAt(i)==string.charAt(i+1)) {
				return false;
			}
			if(vowel.contains(string.charAt(i))) {
				vowel_exist=true;
			}
		}
		
		if(!vowel_exist) {
			return false;
		}
		
		return true;
	} // end of evaluate()
} // end of Main class