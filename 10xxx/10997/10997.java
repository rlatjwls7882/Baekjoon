import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	static char[][] map;
	static int N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.valueOf(br.readLine());
		
		// 별 찍기
		if(N==1) {
			bw.write("*");
		} else {
			int row = 4*N-1;
			int col = 4*N-3;
			
			map = new char[row][col];
			sketchStar(0, row, col);
			
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					if(i==1) {
						bw.write("*");
						break;
					} else if(map[i][j]=='*') {
						bw.write("*");
					} else {
						bw.write(" ");
					}
				}
				bw.newLine();
			}
		}

		bw.close();
	} // end of main()
	
	static void sketchStar(int start, int row, int col) {
		
		for(int i=start;i<col;i++) {

			// 위쪽
			map[start][i]='*';

			// 아래쪽
			map[row-1][i]='*';
			
			// 연결부위 별로 연결
			if(i==col-2) {
				map[start+2][i]='*';
			}
		}

		for(int i=start;i<row;i++) {

			// 왼쪽
			map[i][start]='*';

			// 오른쪽
			if(i>=start+2) {
				map[i][col-1]='*';
			}
		}
		
		if(start<2*(N-1)-1) {
			sketchStar(start+2, row-2, col-2);
		}
		
	} // end of sketchStar()
} // end of Main class