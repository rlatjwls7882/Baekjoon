import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		
		for(int i=1;i<=T;i++) {
			int N = Integer.valueOf(br.readLine());
			
			while(true) {
				if(check(N)) {
					break;
				}
				N--;
			}
			bw.write(String.format("Case #%d: %d\n", i, N));
		}
		
		bw.close();
	} // end of main()
	
	static boolean check(int N) {
		String string = Integer.toString(N);
		
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)=='0'||i+1<string.length()&&string.charAt(i)>string.charAt(i+1)) {
				return false;
			}
		}
		return true;
	} // end of check()
} // end of Main class