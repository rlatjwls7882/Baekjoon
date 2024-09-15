import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	static char[][] map;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int size = 4*Integer.valueOf(br.readLine())-3;
		
		// 별 찍기
		map = new char[size][size];
		
		
		sketchStar(0, size);
		
		for(char[] ROW:map) {
			for(char COL:ROW) {
				if(COL=='*') {
					bw.write('*');
				} else {
					bw.write(' ');
				}
			}
			bw.newLine();
		}

		bw.close();
	} // end of main()
	
	static void sketchStar(int left, int right) {
		for(int i=left;i<right;i++) {
			
			// 왼쪽
			map[i][left]='*';
			
			// 오른쪽
			map[i][right-1]='*';
			
			// 위쪽
			map[left][i]='*';
			
			// 아래쪽
			map[right-1][i]='*';
		}
		
		if(right>left) {
			sketchStar(left+2, right-2);
		}
	} // end of sketchStar()
} // end of Main class