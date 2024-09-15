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
		
		// What is ~ ? 꼴인 문장 찾기
		int idx=0;
		while(string.indexOf("What is", idx)!=-1) {
			int start = string.indexOf("What is", idx);
			int end = string.indexOf("?", start);
			int nextStart = string.indexOf("What is", start+1);
			
			if(nextStart>end||nextStart==-1) {
				bw.write("Forty-two"+string.substring(start+4, end)+".");
				bw.newLine();
			}
			idx=start+1;
		}
		
		bw.close();
	} // end of main()
} // end of Main class