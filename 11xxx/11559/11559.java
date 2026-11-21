import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] moveX = {1, -1, 0, 0};
	static int[] moveY = {0, 0, 1, -1};
    public static void main(String[] args) throws IOException {
    	
    	char[][] strings = new char[12][12];
    	for(int i=0;i<12;i++) {
    		strings[i] = br.readLine().toCharArray();
    	}
    	
    	int cnt=0;
    	while(true) {    		
    		boolean chk=false;
    		boolean[][] visited = new boolean[12][6];
    		for(int i=0;i<12;i++) {
    			for(int j=0;j<6;j++) {
    				if(strings[i][j]!='.' && !visited[i][j]) {
    					Queue<Pos> q = new LinkedList<>();
    					ArrayList<Pos> list = new ArrayList<>();
    					list.add(new Pos(i, j));
    					q.add(new Pos(i, j));
    					visited[i][j]=true;
    					while(!q.isEmpty()) {
    						Pos cur = q.poll();
    						for(int k=0;k<4;k++) {
    							int nextX = cur.x+moveX[k];
    							int nextY = cur.y+moveY[k];
    							if(nextX<0 || nextX>=12 || nextY<0 || nextY>=6 || strings[nextX][nextY]!=strings[i][j] || visited[nextX][nextY]) continue;
    							q.add(new Pos(nextX, nextY));
    							visited[nextX][nextY]=true;
    							list.add(new Pos(nextX, nextY));
    						}
    					}
    					if(list.size()>=4) {
    						chk=true;
    						for(Pos p:list) {
    							strings[p.x][p.y]='.';
    						}
    					}
    				}
    			}
    		}
    		if(chk) {
    			cnt++;
    			for(int i=0;i<6;i++) {
    				int idx=11;
    				for(int j=11;j>=0;j--) {
    					if(strings[j][i]!='.') {
    						if(idx != j) {
    							strings[idx][i] = strings[j][i];
    							strings[j][i]='.';
    						}
    						idx--;
    					}
    				}
    			}
    		} else {
    			break;
    		}
    	}
    	
    	bw.write(Integer.toString(cnt));
        bw.close();
    } // end of main
} // end of Main

class Pos {
	int x, y;
	public Pos(int x, int y) {
		this.x=x;
		this.y=y;
	}
} // end of Pos