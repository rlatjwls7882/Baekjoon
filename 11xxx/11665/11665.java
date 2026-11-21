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
		
		// 직육면체 N개의 교집합의 좌표 계산
		int N = Integer.valueOf(br.readLine());
		
		int x1=1, y1=1, z1=1, x2=1000, y2=1000, z2=1000;
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int tmpx1 = Integer.valueOf(st.nextToken());
			int tmpy1 = Integer.valueOf(st.nextToken());
			int tmpz1 = Integer.valueOf(st.nextToken());
			int tmpx2 = Integer.valueOf(st.nextToken());
			int tmpy2 = Integer.valueOf(st.nextToken());
			int tmpz2 = Integer.valueOf(st.nextToken());
			
			x1 = Math.max(x1, tmpx1);
			y1 = Math.max(y1, tmpy1);
			z1 = Math.max(z1, tmpz1);
			x2 = Math.min(x2, tmpx2);
			y2 = Math.min(y2, tmpy2);
			z2 = Math.min(z2, tmpz2);
		}
		
		// 직육면체 N개의 교집합의 부피 계산
		if(x2<=x1||y2<=y1||z2<=z1) {
			bw.write("0");
		} else {
			bw.write(Integer.toString((x2-x1)*(y2-y1)*(z2-z1)));
		}
		
		bw.close();
	} // end of main()
} // end of Main class