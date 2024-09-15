import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static int[] moveX = {1, -1, 0, 0};
	static int[] moveY = {0, 0, 1, -1};
	static boolean[][] visitList;
	static int[][] map;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 지도 생성
		N = Integer.valueOf(br.readLine());
		map = new int[N][N];
		visitList = new boolean[N][N];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j=0;j<N;j++)
				map[i][j] = Integer.valueOf(st.nextToken());
		}
		
		// 비가 올때 안전한 영역의 최대 개수 계산
		int max=0;
		for(int height=0;height<=100;height++) {
			
			// 물에 잠기지 않은 영역 확인
			for(int i=0;i<N;i++)
				for(int j=0;j<N;j++)
					if(map[i][j]>height)
						visitList[i][j]=true;
			
			// 안전한 영역의 개수 계산
			int cnt=0;
			for(int i=0;i<N;i++)
				for(int j=0;j<N;j++)
					if(visitList[i][j]) {
						bfs(i, j);
						cnt++;
					}
			
			if(cnt==0) break;
			if(cnt>max) max=cnt;
		}
		
		bw.write(max+"");
		bw.close();
	} // end of main()
	
	static void bfs(int x, int y) {
		LinkedList<Pos> queue = new LinkedList<>();
		visitList[x][y]=false;
		queue.add(new Pos(x, y));
		
		while(!queue.isEmpty()) {
			Pos pos = queue.poll();
			
			for(int i=0;i<4;i++) {
				Pos next = new Pos(pos.x+moveX[i], pos.y+moveY[i]);
				
				if(next.x<0||next.x>=N||next.y<0||next.y>=N||!visitList[next.x][next.y])
					continue;
				
				queue.add(next);
				visitList[next.x][next.y]=false;
			}
		}
	} // end of bfs()
} // end of Main class

class Pos {
	int x;
	int y;
	
	Pos(int x, int y) {
		this.x=x;
		this.y=y;
	}
} // end of Pos class