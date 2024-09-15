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
			br.readLine();
			
			// C언어 수강생의 수 N, 경제학 원론 수강생의 수 M
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.valueOf(st.nextToken());
			int M = Integer.valueOf(st.nextToken());
			
			// C언어 수강생의 IQ
			int[] CIQ = new int[N];
			double cAverage=0;
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<N;i++) {
				CIQ[i] = Integer.valueOf(st.nextToken());
				cAverage += CIQ[i];
			}
			cAverage /= N;
			
			// 경제학원론 수강생의 IQ
			st = new StringTokenizer(br.readLine());
			double ecoAverage=0;
			for(int i=0;i<M;i++) {
				ecoAverage += Double.valueOf(st.nextToken());
			}
			ecoAverage /= M;
			
			// 평균을 올릴 수 있는 수강생의 수 계산
			int cnt=0;
			for(int i=0;i<N;i++) {
				if(CIQ[i]<cAverage&&ecoAverage<CIQ[i]) {
					cnt++;
				}
			}
			
			bw.write(Integer.toString(cnt));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class