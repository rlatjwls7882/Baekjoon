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
		
		// 편지 수정
		if(string.indexOf('A')!=-1) {
			for(int i=0;i<string.length();i++) {
				if(string.charAt(i)=='B'||string.charAt(i)=='C'||string.charAt(i)=='D'||string.charAt(i)=='F') {
					bw.write('A');
				} else {
					bw.write(string.charAt(i));
				}
			}
		} else if(string.indexOf('B')!=-1) {
			for(int i=0;i<string.length();i++) {
				if(string.charAt(i)=='C'||string.charAt(i)=='D'||string.charAt(i)=='F') {
					bw.write('B');
				} else {
					bw.write(string.charAt(i));
				}
			}
		} else if(string.indexOf('C')!=-1) {
			for(int i=0;i<string.length();i++) {
				if(string.charAt(i)=='D'||string.charAt(i)=='F') {
					bw.write('C');
				} else {
					bw.write(string.charAt(i));
				}
			}
		} else {
			for(int i=0;i<string.length();i++) {
				bw.write('A');
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class