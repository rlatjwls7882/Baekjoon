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
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 공간 생성
		boolean[][][] space = new boolean[N+2][N+2][N+2];
		
		// 큐브의 좌표 입력
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.valueOf(st.nextToken());
			int j = Integer.valueOf(st.nextToken());
			int k = Integer.valueOf(st.nextToken());
			space[i][j][k]=true;
		}
		
		// 조건을 만족하는 큐브의 개수 계산
		int cnt=0;
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				for(int k=1;k<=N;k++) {
					if(space[i][j][k]&&space[i-1][j][k]&&space[i+1][j][k]&&space[i][j-1][k]&&space[i][j+1][k]&&space[i][j][k-1]&&space[i][j][k+1]) {
						cnt++;
					}
				}
			}
		}
		
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class