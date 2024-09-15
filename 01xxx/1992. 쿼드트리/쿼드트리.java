import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int[][] movie;
	
	public static void main(String[] args) throws IOException {
		
		// 한 변의 길이가 N인 영상 입력
		int N = Integer.valueOf(br.readLine());
		
		movie = new int[N][N];
		for(int i=0;i<N;i++) {
			String string = br.readLine();
			
			for(int j=0;j<N;j++) {
				movie[i][j] = string.charAt(j)-'0';
			}
		}
		
		// 영상 압축 결과 출력
		zipMovie(0, 0, N);
		bw.write(sb.toString());
		
		bw.close();
	} // end of main()
	
	static void zipMovie(int startRow, int startCol, int length) {
		
		
		// 한 구역이 모두 같은 값인 경우
		if(isSameVal(startRow, startCol, length)) {
			sb.append(movie[startRow][startCol]);
			return;
		}

		// 한 구역이 모두 같은 값이 아닌 경우
		else {
			int nextLength = length/2;
			sb.append('(');
			zipMovie(startRow, startCol, nextLength);
			zipMovie(startRow, startCol+nextLength, nextLength);
			zipMovie(startRow+nextLength, startCol, nextLength);
			zipMovie(startRow+nextLength, startCol+nextLength, nextLength);
			sb.append(')');
		}
		
	} // end of zipMovie()
	
	static boolean isSameVal(int startRow, int startCol, int length) {
		int firstVal=movie[startRow][startCol];
		
		for(int i=startRow;i<startRow+length;i++) {
			for(int j=startCol;j<startCol+length;j++) {
				if(firstVal!=movie[i][j]) {
					return false;
				}
			}
		}
		
		return true;
	} // end of isSameVal()
} // end of Main class