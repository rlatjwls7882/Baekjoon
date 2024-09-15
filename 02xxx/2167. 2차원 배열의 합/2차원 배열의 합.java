import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 배열의 크기 N, M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 2차원 배열의 누적합 계산
		int[][] array = new int[N+1][M+1];
		for(int i=1;i<=N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1;j<=M;j++) {
				array[i][j] = Integer.valueOf(st.nextToken());
				array[i][j] += array[i-1][j]+array[i][j-1]-array[i-1][j-1];
			}
		}
		
		// (i,j)~(x,y) 위치까지의 합 계산
		int K = Integer.valueOf(br.readLine());
		while(K-->0) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.valueOf(st.nextToken());
			int j = Integer.valueOf(st.nextToken());
			int x = Integer.valueOf(st.nextToken());
			int y = Integer.valueOf(st.nextToken());
			
			int sum = array[x][y]-array[i-1][y]-array[x][j-1]+array[i-1][j-1];
			bw.write(Integer.toString(sum));
			bw.newLine();
		}

		bw.close();
	} // end of main()
} // end of Main class