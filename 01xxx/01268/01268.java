import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		// 반의 학생 수 N
		int N = Integer.valueOf(br.readLine());
		
		// 각 학생들의 반 입력
		String[] ban = new String[N];
		for(int i=0;i<N;i++) {
			ban[i] = br.readLine();
		}
		
		// 각 학생의 친구 관계 확인
		boolean[][] friend = new boolean[N][N];
		for(int i=0;i<9;i+=2) {
			for(int j=0;j<N;j++) {
				for(int k=j+1;k<N;k++) {
					if(ban[j].charAt(i)==ban[k].charAt(i)) {
						friend[j][k]=friend[k][j]=true;
					}
				}
			}
		}
		
		// 가장 친구가 많은 학생 확인
		int max_friend=0, max_idx=1;
		for(int i=0;i<N;i++) {
			
			int cnt=0;
			for(int j=0;j<N;j++) {
				if(friend[i][j]) {
					cnt++;
				}
			}
			
			if(max_friend<cnt) {
				max_friend=cnt;
				max_idx=i+1;
			}
		}
		
		bw.write(Integer.toString(max_idx));
		
		bw.close();
	} // end of main()
} // end of Main class