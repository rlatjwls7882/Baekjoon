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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		
		int[][] grid = new int[n][m];
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++) {
				grid[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		
		int min = Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				int cur=0;
				for(int k=0;k<n;k++) {
					for(int l=0;l<m;l++) {
						cur += (Math.abs(i-k)+Math.abs(j-l))*grid[k][l];
					}
				}
				min = Math.min(min, cur);
			}
		}
		bw.write(Integer.toString(min));
		
		bw.close();
	} // end of main()
} // end of Main class