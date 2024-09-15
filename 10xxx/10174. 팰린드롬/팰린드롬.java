import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.valueOf(br.readLine());
		
		while(n-->0) {
			String string = br.readLine().toLowerCase();
			
			// 입력한 문자열이 팰린드롬인지 확인
			boolean isPalindrome = true;
			for(int i=0;i<string.length()/2;i++)
				if(string.charAt(i)!=string.charAt(string.length()-1-i)) {
					isPalindrome=false;
					break;
				}
			
			bw.write(isPalindrome?"Yes\n":"No\n");
		}
		
		bw.close();
	} // end of main
} // end of Main class