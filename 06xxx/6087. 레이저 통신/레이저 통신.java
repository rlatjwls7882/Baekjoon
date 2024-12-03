import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] moveX = {1, -1, 0, 0};
	static int[] moveY = {0, 0, 1, -1};
	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int W = Integer.valueOf(st.nextToken());
		int H = Integer.valueOf(st.nextToken());
		
		String[] map = new String[H];
		for(int i=0;i<H;i++) {
			map[i] = br.readLine();
		}
		
		Pos start = new Pos(-1, -1, -1, -1), end = new Pos(-1, -1, -1, -1);
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				if(map[i].charAt(j)=='C') {
					if(start.x==-1) start = new Pos(i, j, 0, -1);
					else end = new Pos(i, j, 0, -1);
				}
			}
		}
		
		boolean[][][] visited = new boolean[H][W][4];
		PriorityQueue<Pos> pq = new PriorityQueue<>();
		for(int i=0;i<4;i++) {			
			pq.add(new Pos(start.x, start.y, 0, i));
		}
		while(!pq.isEmpty()) {
			Pos cur = pq.poll();
			if(visited[cur.x][cur.y][cur.curDir]) continue;
			visited[cur.x][cur.y][cur.curDir]=true;
			if(cur.x==end.x && cur.y==end.y) {
				bw.write(Integer.toString(cur.cost));
				break;
			}
			for(int i=0;i<4;i++) {
				int nextX = cur.x+moveX[i];
				int nextY = cur.y+moveY[i];
				if(nextX<0 || nextX>=H || nextY<0 || nextY>=W || visited[nextX][nextY][i] || map[nextX].charAt(nextY)=='*') continue;
				if(cur.curDir!=i) pq.add(new Pos(nextX, nextY, cur.cost+1, i));
				else pq.add(new Pos(nextX, nextY, cur.cost, i));
			}
		}
		
        bw.close();
    } // end of main
} // end of Main

class Pos implements Comparable<Pos> {
	int x, y, cost, curDir;
	public Pos(int x, int y, int cost, int curDir) {
		this.x=x;
		this.y=y;
		this.cost=cost;
		this.curDir=curDir;
	}
	
	@Override
	public int compareTo(Pos o) {
		return this.cost - o.cost;
	}
} // end of Pos