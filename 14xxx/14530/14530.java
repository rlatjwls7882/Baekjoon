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

		int cnt=0, curPos=x;
		for(int i=1;;i*=-2) {
			if(x<=y&&y<=x+i||x+i<=y&&y<=x) {
				cnt += Math.abs(y-curPos);
				break;  
			} else {
				cnt += Math.abs(x+i-curPos);
				curPos=x+i;
			}
		}
		bw.write(Integer.toString(cnt));

		bw.close();
	} // end of main()
} // end of Main class