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
		int x = Integer.valueOf(st.nextToken());
		int y = Integer.valueOf(st.nextToken());
		
		int K = Integer.valueOf(br.readLine());
		String string = br.readLine();
		
		int cnt=0;
		for(int i=0;;i++) {
			if(Math.abs(x)<=1&&Math.abs(y)<=1) {
				bw.write(i+"\n");
				cnt++;
			}
			
			if(i==K) {
				break;
			}
			
			if(string.charAt(i)=='I') {
				x--;
			} else if(string.charAt(i)=='Z') {
				x++;
			} else if(string.charAt(i)=='S') {
				y--;
			} else {
				y++;
			}
		}
		if(cnt==0) {
			bw.write("-1");
		}
		
		bw.close();
	} // end of main()
} // end of Main class