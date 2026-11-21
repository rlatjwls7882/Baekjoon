import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 데이터 케이스의 수 입력
		int K = Integer.valueOf(br.readLine());
		
		for(int numCases=1;numCases<=K;numCases++) {
			
			// 관심있는 사자의 번호, 사자의 총 마리 수 입력
			StringTokenizer st = new StringTokenizer(br.readLine());
			int L = Integer.valueOf(st.nextToken());
			int n = Integer.valueOf(st.nextToken());
			
			// 사자의 부모 관계도
			st = new StringTokenizer(br.readLine());
			int[] lions = new int[n];
			
			for(int i=0;i<n;i++)
				lions[i] = Integer.valueOf(st.nextToken());
			
			// 사자의 (자신을 포함한) 조상의 수 계산
			int cnt=0, index=L;
			
			while(true) {
				if(index==0) break;

				index = lions[index-1];
				cnt++;
			}
			
			// 사자의 (자신을 포함한) 조상의 수 출력
			bw.write(String.format("Data Set %d:\n%d\n\n", numCases, cnt));
		}
		
		bw.close();
	} // end of main
} // end of Main class