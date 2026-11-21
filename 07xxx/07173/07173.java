import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] moveX = {1, -1, 0, 0};
	static int[] moveY = {0, 0, 1, -1};

	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.valueOf(st.nextToken());
		int N = Integer.valueOf(st.nextToken());
		
		char[][] stu = new char[M][N];
		for(int i=0;i<M;i++) {
			stu[i] = br.readLine().toCharArray();
		}
		
		double sum=0;
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				double interest=0;
				double cnt=0;
				for(int k=0;k<4;k++) {
					int x = i+moveX[k];
					int y = j+moveY[k];
					if(x>=0&&x<M&&y>=0&&y<N) {
						interest += Math.abs(stu[i][j]-stu[x][y]);
						cnt++;
					}
				}
				sum += interest/cnt;
			}
		}
		bw.write(String.format("%.04f", sum));
		
		bw.close();
	} // end of main()
} // end of Main class