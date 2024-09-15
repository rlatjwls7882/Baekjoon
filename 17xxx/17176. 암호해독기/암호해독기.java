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
		
		int length = Integer.valueOf(br.readLine());
		
		// 암호문에 있는 수의 종류
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] chars = new int[53];
		
		for(int i=0;i<length;i++) {
			chars[Integer.valueOf(st.nextToken())]++;
		}
		
		// 평문을 암호화해서 암호문을 만들 수 있는지 확인
		String string = br.readLine();
		
		if(canMake(chars, string, length)) {
			bw.write("y");
		} else {
			bw.write("n");
		}
		
		bw.close();
	} // end of main()
	
	static boolean canMake(int[] chars, String string, int length) {
		for(int i=0;i<length;i++) {
			int idx=0;
			if('A'<=string.charAt(i)&&string.charAt(i)<='Z') {
				idx = string.charAt(i)-'A'+1;
			} else if('a'<=string.charAt(i)&&string.charAt(i)<='z') {
				idx = string.charAt(i)-'a'+27;
			}
			
			if(chars[idx]==0) {
				return false;
			}
			chars[idx]--;
		}
		
		return true;
	} // end of canMake()
} // end of Main class