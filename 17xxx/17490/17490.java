import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 강의동의 수 N, 공사구간의 수 M, 가지고있는 돌의 수 K
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		long K = Long.valueOf(st.nextToken());
		
		// 강의동에서 와우도까지 놓아야하는 돌의 개수 S
		st = new StringTokenizer(br.readLine());
		int[] S = new int[N];
		for(int i=0;i<N;i++) {
			S[i] = Integer.valueOf(st.nextToken());
		}
		
		// 공사중인 길 입력
		int[] construction = new int[M];
		for(int idx=0;idx<M;idx++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.valueOf(st.nextToken())-1;
			int j = Integer.valueOf(st.nextToken())-1;
			
			if(i+1==j) {
				construction[idx]=i;
			} else if(i==j+1) {
				construction[idx]=j;
			} else {
				construction[idx]=N-1;
			}
		}
		Arrays.sort(construction);
		
		// 연결할 때 필요한 돌의 최솟값 계산
		long require=0;
		for(int i=0;i<M;i++) {
			int min=1_000_000;
			
			if(i+1==M) {
				for(int j=construction[i]+1;j<N;j++) {
					min = Math.min(min, S[j]);
				}
				for(int j=0;j<=construction[0];j++) {
					min = Math.min(min, S[j]);
				}
			} else {
				for(int j=construction[i]+1;j<=construction[i+1];j++) {
					min = Math.min(min, S[j]);
				}
			}
			require += min;
		}
		
		if(M==1||require<=K) {
			bw.write("YES");
		} else {
			bw.write("NO");
		}
		
		bw.close();
	} // end of main()
} // end of Main class