import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		String string = br.readLine();
		
		// 문자열의 구성요소 확인
		boolean[][] chars = new boolean[26][2];
		
		for(int i=0;i<N;i++) {
			if('a'<=string.charAt(i)&&string.charAt(i)<='z') {
				chars[string.charAt(i)-'a'][0]=true;
			} else {
				chars[string.charAt(i)-'A'][1]=true;
			}
		}
		
		// 무지개를 만들 수 있는지 확인
		int[] find = {17, 14, 24, 6, 1, 8, 21};
		int low=0, upper=0;
		
		for(int i=0;i<7;i++) {
			if(chars[find[i]][0]) {
				low++;
			}
			if(chars[find[i]][1]) {
				upper++;
			}
		}
		
		if(low==7&&upper==7) {
			bw.write("YeS");
		} else if(low==7) {
			bw.write("yes");
		} else if(upper==7) {
			bw.write("YES");
		} else {
			bw.write("NO!");
		}
		
		bw.close();
	} // end of main()
} // end of Main class