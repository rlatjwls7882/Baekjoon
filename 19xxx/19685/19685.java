import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long S = Long.valueOf(st.nextToken());
		long E = Long.valueOf(st.nextToken());
		
		while(S<=E) {
			if(isPalindrome(Long.toString(S))) {
				bw.write("Palindrome!\n");
			} else {
				bw.write(S+"\n");
			}
			S++;
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