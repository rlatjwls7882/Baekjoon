import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int cntBlue, cntWhite;
	static int[][] paper;
	
	public static void main(String[] args) throws IOException {
		
		// 한 변의 길이가 N인 색종이 입력
		int N = Integer.valueOf(br.readLine());
		
		paper = new int[N][N];
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j=0;j<N;j++) {
				paper[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		
		// 잘라진 하얀색 색종이와 파란색 색종이의 수 계산
		cntPaper(0, 0, N);
		bw.write(Integer.toString(cntWhite));
		bw.newLine();
		bw.write(Integer.toString(cntBlue));
		
		bw.close();
	} // end of main()
	
	static void cntPaper(int startRow, int startCol, int length) {
		
		// 모두 같은 색인 경우
		if(isSameColor(startRow, startCol, length)) {
			if(paper[startRow][startCol]==1) {
				cntBlue++;
			} else {
				cntWhite++;
			}
			return;
		}

		// 모두 같은 색이 아닌 경우
		else {
			int nextLength = length/2;
			cntPaper(startRow, startCol, nextLength);
			cntPaper(startRow+nextLength, startCol, nextLength);
			cntPaper(startRow, startCol+nextLength, nextLength);
			cntPaper(startRow+nextLength, startCol+nextLength, nextLength);
		}
		
	} // end of cntSame()
	
	static boolean isSameColor(int startRow, int startCol, int length) {
		int firstColor=paper[startRow][startCol];
		
		for(int i=startRow;i<startRow+length;i++) {
			for(int j=startCol;j<startCol+length;j++) {
				if(firstColor!=paper[i][j]) {
					return false;
				}
			}
		}
		
		return true;
	} // end of isSameColor()
} // end of Main class