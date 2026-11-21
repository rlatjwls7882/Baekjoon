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
		
		int N = Integer.valueOf(br.readLine());
		
		// 행렬 입력
		int[][] matrix = new int[N][N];
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				matrix[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		
		// 매트릭 행렬인지 확인
		bw.write(Integer.toString(isMetric(matrix, N)));
		
		bw.close();
	} // end of main()
	
	static int isMetric(int[][] matrix, int N) {
		int metric=5;
		for(int x=0;x<N;x++) {
			for(int y=0;y<N;y++) {
				if(x==y) {
					if(matrix[x][y]!=0) {
						metric=1;
						return metric;
					}
				} else {
					if(matrix[x][y]<=0) {
						metric = Math.min(metric, 2);
					}
					if(matrix[x][y]!=matrix[y][x]) {
						metric = Math.min(metric, 3);
					}
				}
				for(int z=0;z<N;z++) {
					if(matrix[x][y]+matrix[y][z]<matrix[x][z]) {
						metric = Math.min(metric, 4);
					}
				}
			}
		}
		
		if(metric==5) {
			return 0;
		} else {
			return metric;
		}
	} // end of isMetric()
} // end of Main class