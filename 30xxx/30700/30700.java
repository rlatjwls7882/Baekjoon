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
		String KOREA = "KOREA";
		
		// KOREA 문자열의 길이 계산
		int length=0;
		
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)==KOREA.charAt(length%5)) {
				length++;
			}
		}
		
		bw.write(Integer.toString(length));
		
		bw.close();
	} // end of main()
} // end of Main class