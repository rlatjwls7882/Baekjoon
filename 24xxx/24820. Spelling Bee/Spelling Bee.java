import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		String puzzle = br.readLine();
		int N = Integer.valueOf(br.readLine());
		
		while(N-->0) {
			String string = br.readLine();
			
			boolean chk=true;
			if(string.length()<4||string.indexOf(puzzle.charAt(0))==-1) {
				chk=false;
			} else {
				for(int i=0;i<string.length();i++) {
					if(puzzle.indexOf(string.charAt(i))==-1) {
						chk=false;
						break;
					}
				}
			}
			
			if(chk) {
				bw.write(string+"\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class