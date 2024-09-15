import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		int n = Integer.valueOf(br.readLine());
		String string = br.readLine();
		
		// uospc의 최대 개수 계산
		int u=0, o=0, s=0, p=0, c=0;
		for(int i=0;i<n;i++) {
			if(string.charAt(i)=='u') {
				u++;
			} else if(string.charAt(i)=='o') {
				o++;
			} else if(string.charAt(i)=='s') {
				s++;
			} else if(string.charAt(i)=='p') {
				p++;
			} else if(string.charAt(i)=='c') {
				c++;
			}
		}
		
		bw.write(Integer.toString(Math.min(Math.min(Math.min(Math.min(u, o), s), p), c)));
		
		bw.close();
	} // end of main()
} // end of Main class