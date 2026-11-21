import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] moveX = {-1, 1, -1, 1, 2, 2, -2, -2};
	static int[] moveY = {2, 2, -2, -2, -1, 1, -1, 1};

	public static void main(String[] args) throws IOException {
		
		char[][] map = new char[5][5];
		for(int i=0;i<5;i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		boolean chk=true;
		int knightCnt=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(map[i][j]=='k') {
					knightCnt++;
					for(int k=0;k<8;k++) {
						int nextX = i+moveX[k];
						int nextY = j+moveY[k];
						if(0<=nextX&&nextX<5&&0<=nextY&&nextY<5&&map[nextX][nextY]=='k') {
							chk=false;
							i=j=5;
							break;
						}
					}
				}
			}
		}
		
		if(chk&&knightCnt==9) {
			bw.write("valid");
		} else {
			bw.write("invalid");
		}
		
		bw.close();
	} // end of main()
} // end of Main class