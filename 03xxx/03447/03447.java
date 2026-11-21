import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 버그를 제거하여 출력
		while(true) {
			String string = br.readLine();
			if(string==null) {
				break;
			}
			
			StringBuilder sb = new StringBuilder(string);
			while(sb.indexOf("BUG")!=-1) {
				int idx = sb.indexOf("BUG");
				sb.delete(idx, idx+3);
			}
			
			bw.write(sb.toString());
			bw.newLine();
		}  
		
		bw.close();
	} // end of main()
} // end of Main class