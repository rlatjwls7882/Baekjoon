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
		
		// 학교의 층 수 n, 한 층에 있는 교실의 수 m, 레이스에 참가하는 반의 수 k
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		int k = Integer.valueOf(st.nextToken());
		
		// 레이스에서 우승하는 반 확인
		int y=n, x=-m, ban=1;
		
		for(int i=1;i<=k;i++) {
			st = new StringTokenizer(br.readLine());
			int f = Integer.valueOf(st.nextToken());
			int d = Integer.valueOf(st.nextToken());
			
			if(y-x>f-d) {
				y=f;
				x=d;
				ban=i;
			}
		}
		
		bw.write(Integer.toString(ban));
		
		bw.close();
	} // end of main()
} // end of Main class