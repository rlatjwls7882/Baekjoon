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
		int length = string.length();
		
		// 문자열이 귀여운지 확인
		if(length>=5&&string.charAt(length-5)=='d'&&string.charAt(length-4)=='r'&&string.charAt(length-3)=='i'&&string.charAt(length-2)=='i'&&string.charAt(length-1)=='p') {
			bw.write("cute");
		} else {
			bw.write("not cute");
		}
		
		bw.close();
	} // end of main()
} // end of Main class