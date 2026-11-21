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
		int gameA=0, gameB=0, scoreA=0, scoreB=0;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)=='A') {
				scoreA++;
			} else {
				scoreB++;
			}
			
			if(scoreA==21) {
				gameA++;
				bw.write(scoreA+"-"+scoreB+"\n");
				if(gameA==2) {
					bw.write('A');
					break;
				}
				scoreA=scoreB=0;
			} else if(scoreB==21) {
				gameB++;
				bw.write(scoreA+"-"+scoreB+"\n");
				if(gameB==2) {
					bw.write('B');
					break;
				}
				scoreA=scoreB=0;
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class