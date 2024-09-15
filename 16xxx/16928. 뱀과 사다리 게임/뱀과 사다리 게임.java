import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	static int[] map = new int[100];
	static int[] snakeAndLadder = new int[100];
	static boolean[] visited = new boolean[100];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 사다리와 뱀의 수 N
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken())+Integer.valueOf(st.nextToken());
		
		// 사다리와 뱀 입력
		while(N-->0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.valueOf(st.nextToken())-1;
			int y = Integer.valueOf(st.nextToken())-1;
			snakeAndLadder[x]=y;
		}
		
		// 100번 칸에 도착하기 위해 주사위를 굴리는 횟수 계산
		bfs();
		bw.write(Integer.toString(map[99]));
		
		bw.close();
	} // end of main()
	
	static void bfs() {
		LinkedList<Integer> queue = new LinkedList<>();
		queue.offer(0);
		
		while(!queue.isEmpty()) {
			int pos = queue.poll();
			
			// 주사위를 굴려 다음 칸으로 이동
			for(int i=1;i<=6;i++) {
				int nextPos=pos+i;
				
				// 이전에 방문하지 않은 칸인 경우
				if(nextPos<100&&!visited[nextPos]) {
					visited[nextPos]=true;
					
					if(snakeAndLadder[nextPos]!=0&&visited[snakeAndLadder[nextPos]]) {
						continue;
					} else if(snakeAndLadder[nextPos]!=0) {
						nextPos = snakeAndLadder[nextPos];
					}
					
					visited[nextPos]=true;
					queue.offer(nextPos);
					map[nextPos]=map[pos]+1;
				}
				
				if(nextPos==99) {
					return;
				}
			}
		}
		
	} // end of bfs()
} // end of Main class