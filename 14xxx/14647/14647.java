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
		
		int[][] cnt = new int[n][m];
		int sum=0;
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++) {
				String string = st.nextToken();
				
				for(int k=0;k<string.length();k++) {
					if(string.charAt(k)=='9') {
						cnt[i][j]++;
					}
				}
				sum += cnt[i][j];
			}
		}
		
		int max=0;
		for(int i=0;i<n;i++) {
			int case1=0;
			for(int j=0;j<m;j++) {
				case1 += cnt[i][j];
			}
			max = Math.max(case1, max);
		}
		for(int i=0;i<m;i++) {
			int case2=0;
			for(int j=0;j<n;j++) {
				case2 += cnt[j][i];
			}
			max = Math.max(case2, max);
		}
		bw.write(sum-max+"");
		
		bw.close();
	} // end of main()
} // end of Main class