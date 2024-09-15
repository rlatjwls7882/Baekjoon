import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 테스트 케이스의 수 입력
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			
			String S = br.readLine();
			
			// 팰린드롬 확인
			boolean isPalindrome = true;
			int cnt=0;
			
			for(int i=0;i<S.length()/2+1;i++) {
				cnt=i+1;
				
				if(S.charAt(i)!=S.charAt(S.length()-1-i)) {
					isPalindrome=false;
					break;
				}
			}
			
			// isPalindrome 반환값과 recursion 함수의 호출 횟수 출력
			bw.write(String.format("%d %d\n", isPalindrome?1:0, cnt));
		}
		
		bw.close();
	} // end of main
} // end of Main class