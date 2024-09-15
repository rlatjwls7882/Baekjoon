import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		
		BigInteger n = new BigInteger(br.readLine());
		
		boolean chk=false;
		for(int i=2;i<=10;i++) {
			String s = n.toString(i);
			if(isPalindrome(s)) {
				chk=true;
				bw.write(i+" "+s+"\n");
			}
		}
		
		if(!chk) {
			bw.write("NIE");
		}
		
		bw.close();
	} // end of main
	
	static boolean isPalindrome(String s) {
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
} // end of Main class