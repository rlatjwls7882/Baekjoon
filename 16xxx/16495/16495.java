import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		String string = br.readLine();
		
		// 열 순서 계산
		long num=0;
		for(int i=0;i<string.length();i++) {
			num += (string.charAt(i)-64)*Math.pow(26, (string.length()-i-1));
		}
		
		bw.write(Long.toString(num));
		
		bw.close();
	} // end of main()
} // end of Main class