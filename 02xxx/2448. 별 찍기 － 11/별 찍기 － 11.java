import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static char[][] star;
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		star = new char[N][N*2];
		
		// 별 생성
		printStar(0, N-1, N);
		
		// 별 출력
		for(int i=0;i<N;i++) {
			for(int j=0;j<N*2;j++) {
				if(star[i][j]=='*') {
					bw.write('*');
				} else {
					bw.write(' ');
				}
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
	
	static void printStar(int startRow, int startCol, int size) {
		
		if(size==3) {
			
			// 첫번째줄
			star[startRow][startCol]='*';
			
			// 두번째줄
			star[startRow+1][startCol-1]='*';
			star[startRow+1][startCol+1]='*';
			
			// 세번째줄
			for(int i=-2;i<=2;i++) {
				star[startRow+2][startCol+i]='*';
			}
			
		} else {
			int nextSize=size/2;
			printStar(startRow, startCol, nextSize);
			printStar(startRow+nextSize, startCol-nextSize, nextSize);
			printStar(startRow+nextSize, startCol+nextSize, nextSize);
		}
		
	} // end of printStar()
} // end of Main class