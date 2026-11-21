import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int t = Integer.valueOf(br.readLine());
		
		while(t-->0) {
			String string = br.readLine();
			String rule = br.readLine();
			
			// 원래 메시지로 변환
			for(int i=0;i<string.length();i++) {
				if(string.charAt(i)==' ') {
					bw.write(' ');
				} else {
					bw.write(rule.charAt(string.charAt(i)-'A'));
				}
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class