import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 희소배열 생성
		int m = Integer.valueOf(br.readLine());
		
		int size = (int)Math.ceil(Math.log(500000)/Math.log(2));
		int[][] f = new int[size+1][m+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1;i<=m;i++) {
			f[0][i] = Integer.valueOf(st.nextToken());
		}
		
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=m;j++) {
				f[i][j] = f[i-1][f[i-1][j]];
			}
		}
		
		// 쿼리 수행
		int Q = Integer.valueOf(br.readLine());
		while(Q-->0) {
			
			// 값 계산
			st = new StringTokenizer(br.readLine());
			int n = Integer.valueOf(st.nextToken());
			int x = Integer.valueOf(st.nextToken());
			
			for(int i=size;i>=0;i--) {
				if(n>=Math.pow(2, i)) {
					n -= Math.pow(2, i);
					x = f[i][x];
				}
			}
			
			// 출력
			bw.write(Integer.toString(x));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class