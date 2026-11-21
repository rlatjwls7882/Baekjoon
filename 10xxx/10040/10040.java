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
		
		// 경기의 수 N, 위원의 수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 비용 A 입력
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = Integer.valueOf(br.readLine());
		}
		
		// 가장 많은 표를 획득한 경기 확인
		int[] game = new int[N];
		int max=0, idx=1;
		
		for(int i=0;i<M;i++) {
			int B = Integer.valueOf(br.readLine());
			
			for(int j=0;j<N;j++) {
				if(A[j]<=B) {
					game[j]++;
					
					if(max<game[j]) {
						max=game[j];
						idx=j+1;
					}
					
					break;
				}
			}
		}
		
		bw.write(Integer.toString(idx));
		
		bw.close();
	} // end of main()
} // end of Main class