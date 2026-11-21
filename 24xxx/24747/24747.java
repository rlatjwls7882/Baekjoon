import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		String letter = br.readLine();
		boolean[] chars = new boolean[26];
		for(int i=0;i<5;i++) {
			chars[letter.charAt(i)-'A']=true;
		}
		
		for(int i=1;i<=7;i++) {
			String string = br.readLine();
			
			if(string.equals(letter)) {
				bw.write("WINNER");
				break;
			} else if(i==7) {
				bw.write("LOSER");
			} else {
				for(int j=0;j<5;j++) {
					if(string.charAt(j)==letter.charAt(j)) {
						bw.write('G');
					} else if(chars[string.charAt(j)-'A']) {
						bw.write('Y');
					} else {
						bw.write('X');
					}
				}
				bw.newLine();
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class