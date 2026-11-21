import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static PriorityQueue<Integer> size = new PriorityQueue<>();
	
	static int M, N;
	static int[] moveX = {1, -1, 0, 0};
	static int[] moveY = {0, 0, 1, -1};
	static boolean[][] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 모눈종이의 크기 M*N, 그리는 직사각형의 개수 K
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.valueOf(st.nextToken());
		N = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		
		// 모눈종이에 직사각형 그리기
		visited = new boolean[M][N];
		while(K-->0) {
			st = new StringTokenizer(br.readLine());
			int y1 = Integer.valueOf(st.nextToken());
			int x2 = M-Integer.valueOf(st.nextToken());
			int y2 = Integer.valueOf(st.nextToken());
			int x1 = M-Integer.valueOf(st.nextToken());
			
			for(int i=x1;i<x2;i++)
				for(int j=y1;j<y2;j++)
					visited[i][j]=true;
		}
		
		// 각 영역의 넓이 계산
		for(int i=0;i<M;i++)
			for(int j=0;j<N;j++)
				if(!visited[i][j])
					bfs(i, j);
		
		bw.write(size.size()+"\n");
		while(!size.isEmpty())
			bw.write(size.poll()+" ");
		
		bw.close();
	} // end of main()
	
	static void bfs(int x, int y) {
		LinkedList<Pos> queue = new LinkedList<>();
		queue.add(new Pos(x, y));
		visited[x][y]=true;
		int area=1;
		
		while(!queue.isEmpty()) {
			
			Pos pos = queue.poll();
			
			for(int i=0;i<4;i++) {
				Pos next = new Pos(pos.x+moveX[i], pos.y+moveY[i]);
				
				if(next.x<0||next.x>=M||next.y<0||next.y>=N||visited[next.x][next.y])
					continue;
				
				queue.add(next);
				visited[next.x][next.y]=true;
				area++;
			}
			
			if(queue.isEmpty()) {
				size.add(area);
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