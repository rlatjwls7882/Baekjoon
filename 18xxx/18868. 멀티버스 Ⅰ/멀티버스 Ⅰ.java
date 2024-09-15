import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int N;
	
	public static void main(String[] args) throws IOException {
		
		// 우주의 개수 M, 행성의 개수 N
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.valueOf(st.nextToken());
		N = Integer.valueOf(st.nextToken());
		
		// 우주의 정보 입력
		int[][] universe = new int[M][N];
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				universe[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		
		// 균등한 우주의 쌍의 개수 계산
		int cnt=0;
		for(int i=0;i<M;i++) {
			for(int j=i+1;j<M;j++) {
				if(isEqual(universe[i], universe[j])) {
					cnt++;
				}
			}
		}
		
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()

	static boolean isEqual(int[] u1, int[] u2) {
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				if(!(u1[i]>u1[j]&&u2[i]>u2[j]||u1[i]==u1[j]&&u2[i]==u2[j]||u1[i]<u1[j]&&u2[i]<u2[j])) {
					return false;
				}
			}
		}
		
		return true;
	} // end of isEqual()
} // end of Main class