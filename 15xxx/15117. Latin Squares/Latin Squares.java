import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		int[][] square = new int[N][N];
		for(int i=0;i<N;i++) {
			String string = br.readLine();
			for(int j=0;j<N;j++) {
				if(string.charAt(j)>='A') {
					square[i][j] = string.charAt(j)-55;
				} else {
					square[i][j] = string.charAt(j)-'0';
				}
			}
		}
	
		if(isLatin(square, N)) {
			if(isReduced(square, N)) {
				bw.write("Reduced");
			} else {
				bw.write("Not Reduced");
			}
		} else {
			bw.write("No");
		}
		
		bw.close();
	} // end of main()
	
	static boolean isReduced(int[][] square, int N) {
		for(int i=0;i<N-1;i++) {
			if(square[0][i]>square[0][i+1]||square[i][0]>square[i+1][0]) {
				return false;
			}
		}
		return true;
	} // end of isReduced()
	
	static boolean isLatin(int[][] square, int N) {
		for(int i=0;i<N;i++) {
			int[] chkRow = new int[36];
			int[] chkCol = new int[36];
			for(int j=0;j<N;j++) {
				if(++chkRow[square[i][j]]>1||++chkCol[square[j][i]]>1) {
					return false;
				}
			}
		}
		return true;
	} // end of isLatin()
} // end of Main class