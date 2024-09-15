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
		
		while(T-->0) {
			int N = Integer.valueOf(br.readLine());
			
			// 가격대비 중량이 가장 높은 맛살 확인
			int minC=0;
			double best=100000;
			
			while(N-->0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int W = Integer.valueOf(st.nextToken());
				int C = Integer.valueOf(st.nextToken());
				
				double CdivW = (double)C/W;
				if(CdivW<best||CdivW==best&&C<minC) {
					best = CdivW;
					minC = C;
				}
				
			}
			
			bw.write(Integer.toString(minC));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class