import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static PriorityQueue<Integer> pictures = new PriorityQueue<>(Collections.reverseOrder());
	
	static int N, M;
	static int[] moveX = {1, -1, 0, 0};
	static int[] moveY = {0, 0, 1, -1};
	static boolean[][] visitList;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 도화지의 크기 N*M
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());
		
		// 그림 입력
		visitList = new boolean[N][M];
		
		for(int i=0;i<N;i++) {
			String string = br.readLine();
			
			for(int j=0;j<M*2;j+=2)
				if(string.charAt(j)=='1')
					visitList[i][j/2]=true;
		}
		
		// 그림의 크기 계산
		for(int i=0;i<N;i++)
			for(int j=0;j<M;j++)
				if(visitList[i][j])
					bfs(i, j);
		
		// 그림의 개수와 최대 크기 출력
		if(pictures.isEmpty()) {
			bw.write("0\n0");
		} else {
			bw.write(pictures.size()+"\n"+pictures.poll());
		}
		
		bw.close();
	} // end of main()
	
	static void bfs(int x, int y) {
		LinkedList<Pos> queue = new LinkedList<>();
		queue.add(new Pos(x, y));
		visitList[x][y]=false;
		int map=1;
		
		while(!queue.isEmpty()) {
			
			Pos pos = queue.poll();
			
			for(int i=0;i<4;i++) {
				Pos next = new Pos(pos.x+moveX[i], pos.y+moveY[i]);
				
				if(next.x<0||next.x>=N||next.y<0||next.y>=M||!visitList[next.x][next.y])
					continue;
				
				queue.add(next);
				visitList[next.x][next.y]=false;
				map++;
			}
			
			if(queue.isEmpty()) {
				pictures.add(map);
				return;
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