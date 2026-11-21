import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Main {
	static int R, C;
	static int[] moveX = {1, -1, 0, 0};
	static int[] moveY = {0, 0, 1, -1};
	static boolean[][] copiedGrid;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 테스트 케이스의 수 T
		int T = Integer.valueOf(br.readLine());
		
		for(int numCases=1;numCases<=T;numCases++) {
			
			// 그리드의 크기 R*C
			StringTokenizer st = new StringTokenizer(br.readLine());
			R = Integer.valueOf(st.nextToken());
			C = Integer.valueOf(st.nextToken());
			
			// 그리드 입력
			boolean[][] grid = new boolean[R][C];
			copiedGrid = new boolean[R][C];
			
			for(int i=0;i<R;i++) {
				String string = br.readLine();
				
				for(int j=0;j<C;j++)
					if(string.charAt(j)=='1')
						grid[i][j]=true;
			}
			
			// N번 연산 수행
			int N = Integer.valueOf(br.readLine());
			
			bw.write(String.format("Case #%d:\n", numCases));
			
			while(N-->0) {
				st = new StringTokenizer(br.readLine());
				
				// M 연산
				if(st.nextToken().equals("M")) {
					int x = Integer.valueOf(st.nextToken());
					int y = Integer.valueOf(st.nextToken());
					int z = Integer.valueOf(st.nextToken());
					
					if(z==1) grid[x][y]=true;
					else grid[x][y]=false;
				}
				
				// Q 연산
				else {
					for(int i=0;i<R;i++)
						for(int j=0;j<C;j++)
							copiedGrid[i][j]=grid[i][j];
					int cnt=0;
					
					for(int i=0;i<R;i++)
						for(int j=0;j<C;j++)
							if(copiedGrid[i][j]) {
								bfs(i, j);
								cnt++;
							}
					
					bw.write(cnt+"\n");
				}
			}
		}
		
		bw.close();
	} // end of main()
	
	static void bfs(int x, int y) {
		LinkedList<Pos> queue = new LinkedList<>();
		queue.add(new Pos(x, y));
		copiedGrid[x][y]=false;
		
		while(!queue.isEmpty()) {
			Pos pos = queue.poll();
			
			for(int i=0;i<4;i++) {
				Pos next = new Pos(pos.x+moveX[i], pos.y+moveY[i]);
				
				if(next.x<0||next.x>=R||next.y<0||next.y>=C||!copiedGrid[next.x][next.y])
					continue;
				
				queue.add(next);
				copiedGrid[next.x][next.y]=false;
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