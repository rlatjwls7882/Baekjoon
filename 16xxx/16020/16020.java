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
		
		int[][] map = new int[N][N];
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				map[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		
		if(map[0][0]>map[1][0]&&map[0][0]<map[0][1]) { // 왼쪽 90˚
			for(int i=0;i<N;i++) {
				for(int j=N-1;j>=0;j--) {
					bw.write(map[j][i]+" ");
				}
				bw.newLine();
			}
		} else if(map[0][0]<map[1][0]&&map[0][0]>map[0][1]) { // 오른쪽 90˚
			for(int i=N-1;i>=0;i--) {
				for(int j=0;j<N;j++) {
					bw.write(map[j][i]+" ");
				}
				bw.newLine();
			}
		} else if(map[0][0]>map[0][1]) { // 180˚
			for(int i=N-1;i>=0;i--) {
				for(int j=N-1;j>=0;j--) {
					bw.write(map[i][j]+" ");
				}
				bw.newLine();
			}
		} else { // 0˚
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					bw.write(map[i][j]+" ");
				}
				bw.newLine();
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class