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
		
		// 시청자가 구독한 스트리머의 수 N, 시청자 변화 추이의 길이 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 랄파의 시청자 변화 추이 입력
		st = new StringTokenizer(br.readLine());
		int[] L = new int[M];
		
		for(int i=0;i<M;i++) {
			L[i] = Integer.valueOf(st.nextToken());
		}
		
		// 사이가 좋지 않은 스트리머의 수 계산
		int cnt=0;
		
		for(int i=1;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			
			int dist=0;
			for(int j=0;j<M;j++) {
				dist += Math.abs(L[j]-Integer.valueOf(st.nextToken()));
				if(dist>2000) {
					cnt++;
					break;
				}
			}
		}
		
		// 악질 시청자인지 확인
		if(cnt*2>=N-1) {
			bw.write("YES");
		} else {
			bw.write("NO");
		}
		
		bw.close();
	} // end of main()
} // end of Main class