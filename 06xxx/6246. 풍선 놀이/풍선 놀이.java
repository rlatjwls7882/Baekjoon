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
		
		// 슬롯의 수 N, 풍선들을 꽂는 횟수 Q
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int Q = Integer.valueOf(st.nextToken());
		
		// 풍선 꽂기
		boolean[] balloon = new boolean[N];
		
		while(Q-->0) {
			st = new StringTokenizer(br.readLine());
			int L = Integer.valueOf(st.nextToken())-1;
			int I = Integer.valueOf(st.nextToken());
			
			while(L<N) {
				balloon[L]=true;
				L+=I;
			}
		}
		
		// 비어있는 슬롯의 개수 계산
		int cnt=0;
		for(int i=0;i<N;i++) {
			if(!balloon[i]) {
				cnt++;
			}
		}
		
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class