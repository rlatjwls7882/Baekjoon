import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int INF=1_000_000_000;
	
	public static void main(String[] args) throws IOException {

		// 물건의 개수 N, 미리 비교한 물건의 개수 M
		int N = Integer.valueOf(br.readLine());
		int M = Integer.valueOf(br.readLine());
		
		// 각 물건보다 작은 물건 확인
		boolean[][] compare = new boolean[N][N];
		
		while(M-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken())-1;
			int b = Integer.valueOf(st.nextToken())-1;
			compare[a][b]=true;
		}
		
		// 각 물건보다 더 작은 물건 확인
		for(int mid=0;mid<N;mid++) {
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(compare[i][mid]&&compare[mid][j]) {
						compare[i][j]=true;
					}
				}
			}
		}
		
		// 각 물건이 비교할 수 없는 물건의 개수 계산
		for(int i=0;i<N;i++) {
			int cnt=0;
			for(int j=0;j<N;j++) { // compare[i][j]:작은 물건, compare[j][i]:큰 물건
				if(i!=j&&(!compare[i][j]&&!compare[j][i])) {
					cnt++;
				}
			}
			bw.write(Integer.toString(cnt));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class