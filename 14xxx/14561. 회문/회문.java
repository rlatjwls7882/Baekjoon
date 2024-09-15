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
		
		int T = Integer.valueOf(br.readLine());
		
		// A를 n진수로 나타낸 수가 팰린드롬인지 확인
		while(T-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long A = Long.valueOf(st.nextToken());
			int n = Integer.valueOf(st.nextToken());
			
			if(isPalindrome(Long.toString(A, n))) {
				bw.write("1\n");
			} else {
				bw.write("0\n");
			}
		}
		
		bw.close();
	} // end of main()
	
	static boolean isPalindrome(String string) {
		int length = string.length()/2;
		
		for(int i=0;i<length;i++) {
			if(string.charAt(i)!=string.charAt(string.length()-1-i)) {
				return false;
			}
		}
		
		return true;
	} // end of isPalindrome
} // end of Main class