import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] moveX = {1, -1, 0, 0};
    static int[] moveY = {0, 0, 1, -1};
	public static void main(String[] args) throws IOException {
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.valueOf(st.nextToken());
    	int M = Integer.valueOf(st.nextToken());
    	
    	int cnt0=0, cnt1=0;
    	boolean type1=true, type2=true;
    	int[][] arr = new int[N][M];
    	for(int i=0;i<N;i++) {
    		st = new StringTokenizer(br.readLine());
    		for(int j=0;j<M;j++) {
    			arr[i][j] = Integer.valueOf(st.nextToken());
    			if(arr[i][j]==1) {
    				cnt1++;
    				if((i+j)%2==0) type1=false;
    				else type2=false;
    			} else {
    				cnt0++;
    				if((i+j)%2==0) type2=false;
    				else type1=false;
    			}
    		}
    	}
    	
    	if(type1 || type2 || cnt0%2==1 || cnt1%2==1) {
    		bw.write("-1");
    	} else {
    		boolean[][] visited = new boolean[N][M];
    		Queue<Pos> queue = new LinkedList<>();
    		for(int i=0;i<N;i++) {
    			for(int j=0;j<M;j++) {
    				if(i+1<N && arr[i][j] == arr[i+1][j]) {
    					queue.add(new Pos(i, j, arr[i][j]));
    					queue.add(new Pos(i+1, j, arr[i][j]));
    					visited[i][j]=visited[i+1][j]=true;
    					i=j=N+M;
    					break;
    				}
    				if(j+1<M && arr[i][j] == arr[i][j+1]) {
    					queue.add(new Pos(i, j, arr[i][j]));
    					queue.add(new Pos(i, j+1, arr[i][j]));
    					visited[i][j]=visited[i][j+1]=true;
    					i=j=N+M;
    					break;
    				}
    			}
    		}
    		
    		ArrayList<String> list = new ArrayList<>();
    		while(!queue.isEmpty()) {
    			Pos a = queue.poll();
    			Pos b = queue.poll();
    			if(a.num == b.num) {
    				list.add((a.x+1)+" "+(a.y+1)+" "+(b.x+1)+" "+(b.y+1)+"\n");
    				for(int i=0;i<4;i++) {
    					int nextX = a.x+moveX[i];
    					int nextY = a.y+moveY[i];
    					if(nextX<0 || nextX>=N || nextY<0 || nextY>=M || visited[nextX][nextY]) continue;
    					queue.add(new Pos(nextX, nextY, arr[nextX][nextY]));
    					visited[nextX][nextY]=true;
    				}
    				for(int i=0;i<4;i++) {
    					int nextX = b.x+moveX[i];
    					int nextY = b.y+moveY[i];
    					if(nextX<0 || nextX>=N || nextY<0 || nextY>=M || visited[nextX][nextY]) continue;
    					queue.add(new Pos(nextX, nextY, arr[nextX][nextY]));
    					visited[nextX][nextY]=true;
    				}
    			} else {
    				Pos c = queue.poll();
    				if(a.num == c.num) {
    					list.add((a.x+1)+" "+(a.y+1)+" "+(c.x+1)+" "+(c.y+1)+"\n");
    					for(int i=0;i<4;i++) {
    						int nextX = a.x+moveX[i];
    						int nextY = a.y+moveY[i];
    						if(nextX<0 || nextX>=N || nextY<0 || nextY>=M || visited[nextX][nextY]) continue;
    						queue.add(new Pos(nextX, nextY, arr[nextX][nextY]));
    						visited[nextX][nextY]=true;
    					}
    					for(int i=0;i<4;i++) {
    						int nextX = c.x+moveX[i];
    						int nextY = c.y+moveY[i];
    						if(nextX<0 || nextX>=N || nextY<0 || nextY>=M || visited[nextX][nextY]) continue;
    						queue.add(new Pos(nextX, nextY, arr[nextX][nextY]));
    						visited[nextX][nextY]=true;
    					}
    					queue.add(b);
    				} else {
    					list.add((b.x+1)+" "+(b.y+1)+" "+(c.x+1)+" "+(c.y+1)+"\n");
    					for(int i=0;i<4;i++) {
    						int nextX = b.x+moveX[i];
    						int nextY = b.y+moveY[i];
    						if(nextX<0 || nextX>=N || nextY<0 || nextY>=M || visited[nextX][nextY]) continue;
    						queue.add(new Pos(nextX, nextY, arr[nextX][nextY]));
    						visited[nextX][nextY]=true;
    					}
    					for(int i=0;i<4;i++) {
    						int nextX = c.x+moveX[i];
    						int nextY = c.y+moveY[i];
    						if(nextX<0 || nextX>=N || nextY<0 || nextY>=M || visited[nextX][nextY]) continue;
    						queue.add(new Pos(nextX, nextY, arr[nextX][nextY]));
    						visited[nextX][nextY]=true;
    					}
    					queue.add(a);
    				}
    			}
    		}
    		
    		bw.write("1\n");
    		for(String s:list) {
    			bw.write(s);
    		}
    	}
    	
        bw.close();
    } // end of main
} // end of Main

class Pos {
	int x, y, num;
	public Pos(int x, int y, int num) {
		this.x=x;
		this.y=y;
		this.num=num;
	}
} // end of Pos