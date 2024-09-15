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
		String PIN = br.readLine();
		
		int idx=0, sum=0;
		for(int i=0;i<PIN.length();i++) {
			if(PIN.charAt(i)<='Z') {
				idx += PIN.charAt(i)-'A'+1;
			} else {
				int cnt = PIN.charAt(i)-'a'+1;
				while(cnt-->0) {
					if(idx>=string.length()) {
						i=PIN.length();
						idx=0;
						break;
					}
					sum += string.charAt(idx)-'0';
					idx++;
				}
			}
		}
		
		if(idx!=string.length()) {
			bw.write("non sequitur");
		} else {
			bw.write(sum+"");
		}
		
		bw.close();
	} // end of main()
} // end of Main class