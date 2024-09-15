import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int INF=25000;
	
	public static void main(String[] args) throws IOException {

		// 지역의 개수 n, 수색범위 m, 길의 개수 r
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		int r = Integer.valueOf(st.nextToken());
		
		// 각 구역에 있는 아이템의 수
		st = new StringTokenizer(br.readLine());
		int[] t = new int[n];
		for(int i=0;i<n;i++) {
			t[i] = Integer.valueOf(st.nextToken());
		}
		
		// 길 입력
		int[][] road = new int[n][n];
		
		for(int i=0;i<n;i++) {
			Arrays.fill(road[i], INF);
			road[i][i]=0;
		}
		
		while(r-->0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken())-1;
			int b = Integer.valueOf(st.nextToken())-1;
			int l = Integer.valueOf(st.nextToken());
			road[a][b]=road[b][a]=l;
		}
		
		// 어떤 지점에 떨어졌을때 다른 지점에 도달하는 최소 시간 계산
		for(int mid=0;mid<n;mid++) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					road[i][j]=Math.min(road[i][j], road[i][mid]+road[mid][j]);
				}
			}
		}
		
		// 예은이가 얻을 수 있는 최대 아이템의 개수 계산
		int max=0;
		for(int i=0;i<n;i++) {
			int itemsFromi=0;
			for(int j=0;j<n;j++) {
				if(road[i][j]<=m) {
					itemsFromi+=t[j];
				}
			}
			max = Math.max(max, itemsFromi);
		}
		
		bw.write(Integer.toString(max));
		
		bw.close();
	} // end of main()
} // end of Main class