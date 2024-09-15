import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		String[] P = {"..#..", ".#.#.", "#.X.#", ".#.#.", "..#.."};
		String[] W = {"..*..", ".*.*.", "*.X.*", ".*.*.", "..*.."};
		String string = br.readLine();
		
		// 단어를 피터팬 프레임과 웬디 프레임으로 장식
		for(int i=0;i<5;i++) {
			for(int j=1;j<=string.length();j++) {
				for(int k=0;k<5;k++) {
					if(k==4&&j!=string.length()&&j%3!=0) {
						break;
					} else if((j-3)%3==1&&k==0) {
						continue;
					} else if(W[i].charAt(k)=='X') {
						bw.write(string.charAt(j-1));
					} else if(j%3==0) {
						bw.write(W[i].charAt(k));
					} else {
						bw.write(P[i].charAt(k));
					}
				}
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class