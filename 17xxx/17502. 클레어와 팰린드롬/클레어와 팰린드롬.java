import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.valueOf(br.readLine());
		String string = br.readLine();
		
		// 팰린드롬 문자열 복구
		for(int i=0;i<N;i++) {
			if(string.charAt(i)=='?') {
				if(string.charAt(N-1-i)=='?') {
					bw.write('a');
				} else {
					bw.write(string.charAt(N-1-i));
				}
			} else {
				bw.write(string.charAt(i));
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class