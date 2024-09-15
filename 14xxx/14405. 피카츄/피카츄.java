import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		char[] S = br.readLine().toCharArray();
		
		// 문자열을 'pi', 'ka', 'chu'를 이어붙여서 만들 수 있는지 확인
		String res = "YES";
		for(int i=0;i<S.length;) {
			if(i+1<S.length&&(S[i]=='p'&&S[i+1]=='i'||S[i]=='k'&&S[i+1]=='a')) {
				i+=2;
			} else if(i+2<S.length&&S[i]=='c'&&S[i+1]=='h'&&S[i+2]=='u') {
				i+=3;
			} else {
				res = "NO";
				break;
			}
		}
		
		bw.write(res);
		bw.close();
	} // end of main()
} // end of Main class