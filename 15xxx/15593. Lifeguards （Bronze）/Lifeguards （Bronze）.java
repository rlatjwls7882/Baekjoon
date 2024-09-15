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
		
		// 각 구조원의 활동 시간
		int[][] time = new int[N][2];
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			time[i][0] = Integer.valueOf(st.nextToken())-1;
			time[i][1] = Integer.valueOf(st.nextToken())-1;
		}
		
		// N-1명의 구조원의 최대 활동 시간 계산
		int maxTime=0;
		for(int i=0;i<N;i++) {
			boolean[] check = new boolean[1000];
			for(int j=0;j<N;j++) {
				if(i!=j) {
					for(int k=time[j][0];k<time[j][1];k++) {
						check[k]=true;
					}
				}
			}
			
			int curTime=0;
			for(int j=0;j<1000;j++) {
				if(check[j]) {
					curTime++;
				}
			}
			maxTime = Math.max(maxTime, curTime);
		}
		bw.write(Integer.toString(maxTime));
		
		bw.close();
	} // end of main()
} // end of Main class