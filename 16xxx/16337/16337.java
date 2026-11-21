import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		String[][][] dice = {
				{{":::", ":o:", ":::"}},
				{{"o::", ":::", "::o"}, {"::o", ":::", "o::"}},
				{{"o::", ":o:", "::o"}, {"::o", ":o:", "o::"}},
				{{"o:o", ":::", "o:o"}},
				{{"o:o", ":o:", "o:o"}},
				{{"ooo", ":::", "ooo"}, {"o:o", "o:o", "o:o"}}
		};
		
		String[] input = new String[3];
		for(int i=0;i<3;i++) {
			input[i] = br.readLine();
		}
		
		boolean chk=false;
		for(int i=0;i<6;i++) {
			for(int j=0;j<dice[i].length;j++) {
				boolean isSame=true;
				for(int k=0;k<3;k++) {
					if(!input[k].equals(dice[i][j][k])) {
						isSame=false;
						break;
					}
				}
				
				if(isSame) {
					chk=true;
					bw.write(Integer.toString(i+1));
					i=6;
					break;
				}
			}
		}
		
		if(!chk) {
			bw.write("unknown");
		}

		bw.close();
	} // end of main()
} // end of Main class