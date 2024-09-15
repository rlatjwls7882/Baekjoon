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
		
		// 사전순으로 최대 부분 수열 확인
		String maxString = "a";
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<=length;j++) {
				String subString = string.substring(i, j);
				if(maxString.compareTo(subString)<0) {
					maxString = subString;
				}
			}
		}
		
		bw.write(maxString);
		
		bw.close();
	} // end of main()
} // end of Main class