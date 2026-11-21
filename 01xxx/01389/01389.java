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
		
		// 유저의 수 N, 친구 관계의 수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 친구 관계 입력
		int[][] step = new int[N][N];
		for(int i=0;i<N;i++) {
			Arrays.fill(step[i], 1_000_000_000);
		}
		
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.valueOf(st.nextToken())-1;
			int B = Integer.valueOf(st.nextToken())-1;
			
			step[A][B]=1;
			step[B][A]=1;
		}
		
		// 친구 관계의 단계수 계산
		for(int mid=0;mid<N;mid++) {
			for(int start=0;start<N;start++) {
				for(int end=0;end<N;end++) {
					if(step[start][end] > step[start][mid]+step[mid][end]) {
						step[start][end] = step[start][mid]+step[mid][end];
					}
				}
			}
		}
		
		// 케빈 베이컨의 수가 가장 적은 사람 계산
		int idx=0, min=1_000_000_000;
		
		for(int i=0;i<N;i++) {
			
			int sum=0;
			for(int j=0;j<N;j++) {
				sum += step[i][j];
			}
			
			if(min>sum) {
				min=sum;
				idx=i+1;
			}
		}
		
		bw.write(Integer.toString(idx));
		
		bw.close();
	} // end of main()
} // end of Main class