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
		
		int T = Integer.valueOf(br.readLine());
		
		// 재미도 계산
		int fun=0, lastl=0, lastr=0;
		for(int i=0;i<T;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int l = Integer.valueOf(st.nextToken());
			int r = Integer.valueOf(st.nextToken());
			
			if(i>0) {
				if(lastl==l&&l!=0) {
					fun++;
				}
				if(lastr==r&&r!=0) {
					fun++;
				}
			}
			
			if(l==r&&l!=0) {
				fun++;
			}
			
			lastl=l;
			lastr=r;
		}
		
		bw.write(Integer.toString(fun));
		
		bw.close();
	} // end of main()
} // end of Main class