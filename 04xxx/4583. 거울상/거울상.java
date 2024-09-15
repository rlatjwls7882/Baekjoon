import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		while(true) {
			String string = br.readLine();
			if(string.equals("#")) {
				break;
			}
			
			// 거울이 비춰지기 전 모습으로 표현
			StringBuilder sb = new StringBuilder();
			
			for(int i=string.length()-1;i>=0;i--) {
				if(string.charAt(i)=='b') {
					sb.append('d');
				} else if(string.charAt(i)=='d') {
					sb.append('b');
				} else if(string.charAt(i)=='p') {
					sb.append('q');
				} else if(string.charAt(i)=='q') {
					sb.append('p');
				} else if(string.charAt(i)=='i'||string.charAt(i)=='o'||string.charAt(i)=='v'||string.charAt(i)=='w'||string.charAt(i)=='x') {
					sb.append(string.charAt(i));
				} else {
					sb = new StringBuilder("INVALID");
					break;
				}
			}
			
			bw.write(sb.toString());
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class