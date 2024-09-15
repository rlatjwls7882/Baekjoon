import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] moveX = {1, -1, 0, 0, 0, 0};
	static int[] moveY = {0, 0, 1, -1, 0, 0};
	static int[] moveZ = {0, 0, 0, 0, 1, -1};
	static boolean[][][] visitList;
	static int[][][] arriveTime;
	static int L, R, C;

	public static void main(String[] args) throws IOException {

		while(true) {
			
			// 층수 L, 행과 열의 수 R C
			StringTokenizer st = new StringTokenizer(br.readLine());
			L = Integer.valueOf(st.nextToken());
			R = Integer.valueOf(st.nextToken());
			C = Integer.valueOf(st.nextToken());
			if(L==0&&R==0&&C==0) {
				break;
			}
			
			// 초기화
			visitList = new boolean[L][R][C];
			arriveTime = new int[L][R][C];
			int[] start = new int[3];
			int[] end = new int[3];
			
			// 빌딩의 각 칸 입력
			for(int i=0;i<L;i++) {
				for(int j=0;j<R;j++) {
					String string = br.readLine();
					
					for(int k=0;k<C;k++) {
						if(string.charAt(k)=='S') {
							start[0]=i;
							start[1]=j;
							start[2]=k;
						} else if(string.charAt(k)=='E') {
							end[0]=i;
							end[1]=j;
							end[2]=k;
							visitList[i][j][k]=true;
						} else if(string.charAt(k)=='.') {
							visitList[i][j][k]=true;
						}
					}
				}
				br.readLine();
			}
			
			// 빌딩을 탈출할 수 있는지 확인
			bfs(start);
			if(visitList[end[0]][end[1]][end[2]]) {
				bw.write("Trapped!\n");
			} else {
				bw.write(String.format("Escaped in %d minute(s).\n", arriveTime[end[0]][end[1]][end[2]]));
			}
		}

		bw.close();
	} // end of main()

	static void bfs(int[] start) {
		LinkedList<Pos> q = new LinkedList<>();
		q.add(new Pos(start[0], start[1], start[2]));

		while(!q.isEmpty()) {
			Pos curPos = q.poll();

			for(int i=0;i<6;i++) {
				Pos nextPos = new Pos(curPos.x+moveX[i], curPos.y+moveY[i], curPos.z+moveZ[i]);

				if(nextPos.x<0||nextPos.x>=L||nextPos.y<0||nextPos.y>=R||nextPos.z<0||nextPos.z>=C||!visitList[nextPos.x][nextPos.y][nextPos.z]) {
					continue;
				} else {
					arriveTime[nextPos.x][nextPos.y][nextPos.z]=arriveTime[curPos.x][curPos.y][curPos.z]+1;
					visitList[nextPos.x][nextPos.y][nextPos.z]=false;
					q.add(nextPos);
				}
			}
		}

	} // end of bfs()
} // end of Main class

class Pos {
	int x, y, z;

	public Pos(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
} // end of Pos class 