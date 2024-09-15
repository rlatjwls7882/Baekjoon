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
		
		// 가장 많이 등장한 알파벳의 등장 횟수 계산
		int[] alpha = new int[26];
		int max=0;
		
		for(int i=0;i<N;i++) {
			if(!(string.charAt(i)==' '||string.charAt(i)==','||string.charAt(i)=='.')) {
				int pos = string.charAt(i)-'a';
				max = Math.max(max, ++alpha[pos]);
			}
		}
		
		bw.write(Integer.toString(max));
		
		bw.close();
	} // end of main()
} // end of Main class