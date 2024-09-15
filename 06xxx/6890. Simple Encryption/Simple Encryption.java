import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		String keyword = br.readLine();
		String message = br.readLine();
		
		int idx1=0, idx2=0;
		while(idx2<message.length()) {
			if(message.charAt(idx2)<'A'||message.charAt(idx2)>'Z') {
				idx2++;
				continue;
			}
			
			bw.write((message.charAt(idx2%message.length())-'A'+keyword.charAt(idx1%keyword.length())-'A')%26+'A');
			idx1++;
			idx2++;
		}
		
		bw.close();
	} // end of main()
} // end of Main class