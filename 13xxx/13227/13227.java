import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		char[][] map = new char[3][3];
		
		for(int i=0;i<3;i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		boolean chk=false;
		for(int i=0;i<3;i++) {
			if((map[i][0]=='O'||map[i][0]=='X')&&map[i][0]==map[i][1]&&map[i][0]==map[i][2]) {
				chk=true;
				break;
			}
			if((map[0][i]=='O'||map[0][i]=='X')&&map[0][i]==map[1][i]&&map[0][i]==map[2][i]) {
				chk=true;
				break;
			}
		}
		if((map[0][0]=='O'||map[0][0]=='X')&&map[0][0]==map[1][1]&&map[1][1]==map[2][2]) {
			chk=true;
		}
		if((map[2][0]=='O'||map[2][0]=='X')&&map[2][0]==map[1][1]&&map[1][1]==map[0][2]) {
			chk=true;
		}
		
		if(chk) {
			bw.write("YES");
		} else {
			bw.write("NO");
		}
		
		bw.close();
	} // end of main()
} // end of Main class