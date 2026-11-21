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
			String s1 = br.readLine();
			String s2 = br.readLine();
			if(s1.equals("E")) {
				break;
			}
			
			int p1=0, p2=0;
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)=='R'&&s2.charAt(i)=='S'||s1.charAt(i)=='S'&&s2.charAt(i)=='P'||s1.charAt(i)=='P'&&s2.charAt(i)=='R') {
					p1++;
				} else if(s1.charAt(i)=='S'&&s2.charAt(i)=='R'||s1.charAt(i)=='P'&&s2.charAt(i)=='S'||s1.charAt(i)=='R'&&s2.charAt(i)=='P') {
					p2++;
				}
			}
			
			bw.write(String.format("P1: %d\n", p1));
			bw.write(String.format("P2: %d\n", p2));
		}

		bw.close();
	} // end of main()
} // end of Main class