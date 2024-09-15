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

		int N = Integer.valueOf(br.readLine());
		
		// 가장 남쪽에 있는 점 계산
		int x=1000, y=1001;
		
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int xi = Integer.valueOf(st.nextToken());
			int yi = Integer.valueOf(st.nextToken());
			
			if(yi<y) {
				y=yi;
				x=xi;
			}
		}
		
		bw.write(Integer.toString(x));
		bw.write(' ');
		bw.write(Integer.toString(y));
		
		bw.close();
	} // end of main()
} // end of Main class