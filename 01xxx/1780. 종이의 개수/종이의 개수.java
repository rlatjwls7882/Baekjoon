import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] cnt = new int[3];
	static int[][] paper;
	
	public static void main(String[] args) throws IOException {
		
		// 한 변의 길이가 N인 종이 입력
		int N = Integer.valueOf(br.readLine());
		
		paper = new int[N][N];
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j=0;j<N;j++) {
				paper[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		
		// -1, 0, 1로만 채워진 종이의 개수 계산
		cntPaper(0, 0, N);
		
		bw.write(Integer.toString(cnt[0]));
		bw.newLine();
		bw.write(Integer.toString(cnt[1]));
		bw.newLine();
		bw.write(Integer.toString(cnt[2]));
		
		bw.close();
	} // end of main()
	
	static void cntPaper(int startRow, int startCol, int length) {
		
		// 한 구역이 모두 같은 값인 경우
		if(isSameVal(startRow, startCol, length)) {
			cnt[paper[startRow][startCol]+1]++;
		}

		// 한 구역이 모두 같은 값이 아닌 경우
		else {
			int nextLength = length/3;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					cntPaper(startRow+nextLength*i, startCol+nextLength*j, nextLength);
				}
			}
		}
		
	} // end of cntPaper()
	
	static boolean isSameVal(int startRow, int startCol, int length) {
		int firstVal=paper[startRow][startCol];
		
		for(int i=startRow;i<startRow+length;i++) {
			for(int j=startCol;j<startCol+length;j++) {
				if(firstVal!=paper[i][j]) {
					return false;
				}
			}
		}
		
		return true;
	} // end of isSameVal()
} // end of Main class