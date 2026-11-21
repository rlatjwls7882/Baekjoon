import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			
			// 문자열 N개 입력
			int N = Integer.valueOf(br.readLine());
			String[] strings = new String[N];
			for(int i=0;i<N;i++)
				strings[i] = br.readLine();
			
			// 2개의 문자열을 골라 팰린드롬을 만들 수 있는지 확인
			boolean isPalindrome = false;
			
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(i!=j&&isPalindrome(strings[i], strings[j])) {
						bw.write(strings[i]);
						bw.write(strings[j]);
						bw.newLine();
						isPalindrome=true;
						i=j=N;
					}
				}
			}
			
			if(!isPalindrome) {
				bw.write("0\n");
			}
		}
		
		bw.close();
	} // end of main()
	
	static boolean isPalindrome(String s1, String s2) {
		String string = s1+s2;
		int length = string.length();
		
		for(int i=0;i<length/2;i++)
			if(string.charAt(i)!=string.charAt(length-i-1))
				return false;
		
		return true;
	} // end of isPalindrome()
} // end of Main class