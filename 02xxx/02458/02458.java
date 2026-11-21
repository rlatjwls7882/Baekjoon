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

		// 학생의 수 N, 키를 비교한 횟수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 각 학생의 노드 생성
		int[][] stu = new int[N][N];
		for(int i=0;i<N;i++) {
			Arrays.fill(stu[i], INF);
			stu[i][i]=0;
		}
		
		// a에서 b로 향하는 간선 입력
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken())-1;
			int b = Integer.valueOf(st.nextToken())-1;
			stu[a][b]=1;
		}
		
		// 한 노드에서 다른 노드로 가는 최단거리 계산
		for(int mid=0;mid<N;mid++) {
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					stu[i][j] = Math.min(stu[i][j], stu[i][mid]+stu[mid][j]);
				}
			}
		}
		
		// 자신의 키가 몇번째인지 알 수 있는 학생의 수 계산
		// = 자신을 제외한 모든 노드에서 오거나 갈 수 있는지 확인
		int cnt=0;
		for(int i=0;i<N;i++) {
			boolean canCompare=true;
			for(int j=0;j<N;j++) {
				if(stu[i][j]==INF&&stu[j][i]==INF) {
					canCompare=false;
					break;
				}
			}
			
			if(canCompare) {
				cnt++;
			}
		}
		
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class