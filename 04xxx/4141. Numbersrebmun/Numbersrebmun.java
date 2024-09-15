import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		String[] alphabets = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
		
		int N = Integer.valueOf(br.readLine());

		while(N-->0) {
			String string = br.readLine().toUpperCase();
			
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<string.length();i++) {
				for(int j=0;j<8;j++) {
					if(alphabets[j].indexOf(string.charAt(i))!=-1) {
						sb.append(j);
						break;
					}
				}
			}
			
			if(isPalindrome(sb.toString())) {
				bw.write("YES\n");
			} else {
				bw.write("NO\n");
			}
		}
		
		bw.close();
	} // end of main()
	
	static boolean isPalindrome(String string) {
		for(int i=0;i<string.length()/2;i++) {
			if(string.charAt(i)!=string.charAt(string.length()-1-i)) {
				return false;
			}
		}
		return true;
	} // end of isPalindrome
} // end of Main class