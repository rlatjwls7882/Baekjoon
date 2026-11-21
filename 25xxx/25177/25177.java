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
		
		// 지금 시설이 있는 장소의 수 N, 예전에 시설이 있었던 장소의 수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 지금 시설의 점수 입력
		st = new StringTokenizer(br.readLine());
		int[] now = new int[Math.max(N, M)];
		
		for(int i=0;i<N;i++) {
			now[i] = Integer.valueOf(st.nextToken());
		}
		
		// 예전 시설의 점수 입력
		st = new StringTokenizer(br.readLine());
		int[] pre = new int[Math.max(N, M)];
		
		for(int i=0;i<M;i++) {
			pre[i] = Integer.valueOf(st.nextToken());
		}
		
		// 늘릴 수 있는 최대 점수 확인
		int max=0;
		
		for(int i=0;i<M;i++) {
			max = Math.max(max, pre[i]-now[i]);
		}
		
		bw.write(Integer.toString(max));
		
		bw.close();
	} // end of main()
} // end of Main class