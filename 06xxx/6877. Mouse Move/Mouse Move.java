import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int c = Integer.valueOf(st.nextToken());
		int r = Integer.valueOf(st.nextToken());
		
		int x=0, y=0;
		while(true) {
			st = new StringTokenizer(br.readLine());
			int moveX = Integer.valueOf(st.nextToken());
			int moveY = Integer.valueOf(st.nextToken());
			if(moveX==0&&moveY==0) {
				break;
			}
			
			if(moveX>0) {
				x = Math.min(c, x+moveX);
			} else {
				x = Math.max(0, x+moveX);
			}
			if(moveY>0) {
				y = Math.min(r, y+moveY);
			} else {
				y = Math.max(0, y+moveY);
			}
			bw.write(x+" "+y+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class