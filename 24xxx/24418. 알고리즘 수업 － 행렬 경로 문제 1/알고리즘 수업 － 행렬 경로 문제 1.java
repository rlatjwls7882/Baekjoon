import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int cnt=0;
	
	public static void main(String[] args) throws IOException {
		
		// 행렬의 크기 n
		int n = Integer.valueOf(br.readLine());
		int[][] map = new int[n][n];
		
		// 코드1, 코드2(n²) 실행횟수 계산
		matrix_path(map, n, n);
		
		bw.write(Integer.toString(cnt));
		bw.write(' ');
		bw.write(Integer.toString(n*n));
		
		bw.close();
	} // end of main()
	
	static void matrix_path(int[][] m, int i, int j) {
		if(i==0||j==0) {
			cnt++; // 코드1
		} else {
			matrix_path(m, i-1, j);
			matrix_path(m, i, j-1);
		}
	} // end of matrix_path()
} // end of Main class