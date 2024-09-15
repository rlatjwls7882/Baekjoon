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
		
		int n = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		double k = Double.valueOf(st.nextToken());
		double m1 = Double.valueOf(st.nextToken());
		double m2 = Double.valueOf(st.nextToken());
		
		// 규칙에 맞지 않는 신발 쌍의 수 계산
		int cnt=0;
		while(n-->0) {
			st = new StringTokenizer(br.readLine());
			double hi = Double.valueOf(st.nextToken());
			double ki = Double.valueOf(st.nextToken());
			double minHeight=hi/m1;
			double maxHeight=hi*k/m2;
			
			for(int j=0;j<ki;j++) {
				double sizeij = Double.valueOf(st.nextToken());
				if(!(minHeight<=sizeij&&sizeij<=maxHeight)) {
					cnt++;
				}
			}
		}
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class