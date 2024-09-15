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
		
		while(N-->0) {
			String string = br.readLine();
			
			int x=0, y=0, wildCard=0;
			for(int i=0;i<string.length();i++) {
				if(string.charAt(i)=='R') {
					x++;
				} else if(string.charAt(i)=='L') {
					x--;
				} else if(string.charAt(i)=='U') {
					y++;
				} else if(string.charAt(i)=='D') {
					y--;
				} else {
					wildCard++;
				}
			}
			
			bw.write((x-wildCard)+" "+(y-wildCard)+" "+(x+wildCard)+" "+(y+wildCard)+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class