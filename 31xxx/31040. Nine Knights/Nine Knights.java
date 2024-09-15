import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int t = Integer.valueOf(br.readLine());
		for(int i=0;i<t;i++) {
			if(i!=0) {
				br.readLine();
			}
			char[][] board = new char[5][5];
			for(int j=0;j<5;j++) {
				board[j] = br.readLine().toCharArray();
			}
			
			boolean chk=true;
			for(int j=0;j<5;j++) {
				for(int k=0;k<5;k++) {
					if(board[j][k]=='k'&&(j+2<5&&k-1>=0&&board[j+2][k-1]=='k'||j+2<5&&k+1<5&&board[j+2][k+1]=='k')) {
						chk=false;
						j=5;
						break;
					}
				}
			}
			
			if(chk) {
				bw.write("valid\n");
			} else {
				bw.write("invalid\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class