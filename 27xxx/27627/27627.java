import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		String string = br.readLine();
		
		// 문자열을 분할 할 수 있는지 확인
		boolean canSplit=false;
		
		for(int i=1;i<string.length();i++) {
			if(isPalindrome(string.substring(0, i))&&isPalindrome(string.substring(i))) {
				bw.write(string.substring(0, i)+" "+string.substring(i));
				canSplit=true;
				break;
			}
		}
		
		if(!canSplit) {
			bw.write("NO");
		}
		
		bw.close();
	} // end of main()
	
	static boolean isPalindrome(String string) {
		int length = string.length();
		for(int i=0;i<length/2;i++) {
			if(string.charAt(i)!=string.charAt(length-1-i)) {
				return false;
			}
		}
		return true;
	} // end of isPalindrome()
} // end of Main class