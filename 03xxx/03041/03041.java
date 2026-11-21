import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 최종적으로 있어야할 위치
		Pos[] answerPos = new Pos[16];
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				answerPos[i*4+j] = new Pos(i, j);
			}
		}
		
		// 퍼즐의 흩어짐 정도 계산
		int spread=0;
		for(int i=0;i<4;i++) {
			String string = br.readLine();
			for(int j=0;j<4;j++) {
				if(string.charAt(j)=='.') {
					continue;
				}
				
				Pos pos = answerPos[string.charAt(j)-'A'];
				spread += Math.abs(i-pos.x)+Math.abs(j-pos.y);
			}
		}
		
		bw.write(Integer.toString(spread));
		
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