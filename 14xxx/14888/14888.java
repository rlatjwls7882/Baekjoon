import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static int[] opt = new int[4];
	static int[] A;
	static int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 수열 입력
		N = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		A = new int[N];
		for(int i=0;i<N;i++)
			A[i] = Integer.valueOf(st.nextToken());
		
		// 연산자의 개수 입력
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<4;i++)
			opt[i] = Integer.valueOf(st.nextToken());
		
		// 만들 수 있는 식의 최댓값, 최솟값 계산
		dfs(A[0], 1);
		bw.write(max+"\n"+min);
		
		bw.close();
	} // end of main()
	
	static void dfs(int val, int depth) {
		
		// N-1번 연산한 경우
		if(depth==N) {
			if(max<val) max=val;
			if(min>val) min=val;
			return;
		}
		
		// N-1번 연산할때까지 반복
		for(int i=0;i<4;i++)
			if(opt[i]>0) {
				opt[i]--;
				
				if(i==0) {
					dfs(val+A[depth], depth+1);
				} else if(i==1) {
					dfs(val-A[depth], depth+1);
				} else if(i==2) {
					dfs(val*A[depth], depth+1);
				} else {
					dfs(val/A[depth], depth+1);
				}
				
				opt[i]++;
			}
	} // end of dfs()
} // end of Main class