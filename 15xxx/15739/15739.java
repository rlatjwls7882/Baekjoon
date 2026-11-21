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
		
		// 정방행렬 입력
		int[][] square = new int[N][N];
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				square[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		
		// 매직스퀘어인지 확인
		if(isMagicSquare(square, N, N*(N*N+1)/2)) {
			bw.write("TRUE");
		} else {
			bw.write("FALSE");
		}
		
		bw.close();
	} // end of main()
	
	static boolean isMagicSquare(int[][] square, int N, int sum) {
		
		// 모든 수가 1번씩 등장하는지 확인
		int[] nums = new int[N*N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				nums[square[i][j]-1]++;
				if(nums[square[i][j]-1]>1) {
					return false;
				}
			}
		}
		
		// 가로 세로
		for(int i=0;i<N;i++) {
			int sumRow=0, sumCol=0;
			for(int j=0;j<N;j++) {
				sumRow += square[i][j];
				sumCol += square[j][i];
			}
			if(sumCol!=sum||sumRow!=sum) {
				return false;
			}
		}
		
		// 대각선
		int sum1=0, sum2=0;
		for(int i=0;i<N;i++) {
			sum1 += square[i][i];
			sum2 += square[i][N-1-i];
		}
		if(sum1!=sum||sum2!=sum) {
			return false;
		}
		
		return true;
	} // end of isMagicSquare()
} // end of Main class