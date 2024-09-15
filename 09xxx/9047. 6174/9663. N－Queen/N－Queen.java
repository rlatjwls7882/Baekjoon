import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
	
	static int N, cnt;
	static int[] columns; // 행번호 : index, 열번호 : index의 값
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// N-Queen 계산
		N = Integer.valueOf(br.readLine());
		columns = new int[N];
		
		dfs(0);
		bw.write(cnt+"");
		
		bw.close();
	} // end of main()
	
	static void dfs(int depth) {
		
		if(depth==N) {
			cnt++;
			return;
		}
		
		for(int i=0;i<N;i++) {
			
			columns[depth]=i;
			
			// 퀸이 서로 공격할 수 있는지 확인
			if(canAttack(depth))
				continue;
			
			// 퀸 세우기
			dfs(depth+1);
		}
		
	} // end of dfs()
	
	static boolean canAttack(int col) {
		
		for(int i=0;i<col;i++) {

				// 가로줄 판별
				if(columns[i]==columns[col]) {
					return true;
				}

				// 대각선 판별
				if(Math.abs(i-col)==Math.abs(columns[i]-columns[col])) {
					return true;
				}
		}
		
		return false;
	} // end of canAttack()
} // end of Main class