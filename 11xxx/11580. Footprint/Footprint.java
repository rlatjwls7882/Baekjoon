import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int L = Integer.valueOf(br.readLine());
		String string = br.readLine();
		
		// 좌표평면 위에 찍힌 발자국의 수 계산
		boolean[][] posList = new boolean[2001][2001];
		Pos pos = new Pos(1000, 1000);
		posList[1000][1000]=true;
		int cnt=1;
		
		for(int i=0;i<L;i++) {
			if(string.charAt(i)=='S') {
				pos.y--;
			} else if(string.charAt(i)=='N') {
				pos.y++;
			} else if(string.charAt(i)=='E') {
				pos.x++;
			} else {
				pos.x--;
			}
			if(!posList[pos.x][pos.y]) {
				posList[pos.x][pos.y]=true;
				cnt++;
			}
		}

		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class

class Pos {
	int x, y;
	
	public Pos(int x, int y) {
		this.x=x;
		this.y=y;
	}
} // end of Pos class