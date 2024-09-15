import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {

		// 길이 N의 문자열 입력
		int N = Integer.valueOf(br.readLine());
		String string = br.readLine();
		
		// 문자열의 왼쪽과 오른쪽에서 각 문자의 등장 횟수 계산
		int[] alpha = new int[26];
		for(int i=0;i<N;i++) {
			if(N%2==1&&i==N/2) {
				continue;
			} else {
				alpha[string.charAt(i)-'a']++;
			}
		}
		
		// 주어진 연산을 0회 이상 사용해 팰린드롬으로 만들 수 있는지 확인
		boolean canMake=true;
		for(int i=0;i<26;i++) {
			if(alpha[i]%2==1) {
				canMake=false;
				break;
			}
		}
		
		bw.write(canMake?"Yes":"No");
		
		bw.close();
	} // end of main()
} // end of Main class