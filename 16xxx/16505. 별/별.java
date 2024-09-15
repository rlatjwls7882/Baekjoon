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
		
		if(N==0) {
			bw.write("*");
		} else {
			
			int size = (int)Math.pow(2, N);
			star = new char[size][size];
			
			// 별 생성
			printStar(0, 0, size);
			
			// 별 출력
			for(int i=0;i<size;i++) {
				for(int j=0;j<size-i;j++) {
					if(star[i][j]=='*') {
						bw.write('*');
					} else {
						bw.write(' ');
					}
				}
				bw.newLine();
			}
		}
		
		bw.close();
	} // end of main()
	
	static void printStar(int startRow, int startCol, int size) {
		
		if(size==2) {
			star[startRow][startCol]='*';
			star[startRow+1][startCol]='*';
			star[startRow][startCol+1]='*';
		} else {
			int nextSize=size/2;
			printStar(startRow, startCol, nextSize);
			printStar(startRow+nextSize, startCol, nextSize);
			printStar(startRow, startCol+nextSize, nextSize);
		}
		
	} // end of printStar()
} // end of Main class