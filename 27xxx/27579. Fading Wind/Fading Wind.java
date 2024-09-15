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
		int h = Integer.valueOf(st.nextToken());
		int k = Integer.valueOf(st.nextToken());
		int v = Integer.valueOf(st.nextToken());
		int s = Integer.valueOf(st.nextToken());
		
		int move=0;
		while(h>0) {
			v+=s;
			v -= Math.max(1, v/10);
			
			if(v>=k) {
				h++;
			} else if(v>0) {
				if(--h==0) {
					v=0;
				}
			} else {
				v=h=0;
			}
			
			move+=v;
			if(s>0) {
				s--;
			}
		}
		bw.write(move+"");
		
		bw.close();
	} // end of main()
} // end of Main class