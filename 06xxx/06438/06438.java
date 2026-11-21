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
		
		// N개의 문장 뒤집기
		while(N-->0) {
			String string = br.readLine();
			
			for(int i=string.length()-1;i>=0;i--) {
				bw.write(string.charAt(i));
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class