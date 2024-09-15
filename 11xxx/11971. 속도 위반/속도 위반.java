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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 각 구간의 제한속도 입력
		int[] limit = new int[100];
		int idx=0;
		
		while(N-->0) {
			st = new StringTokenizer(br.readLine());
			int length = Integer.valueOf(st.nextToken());
			int speed = Integer.valueOf(st.nextToken());
			
			while(length-->0) {
				limit[idx++]=speed;
			}
		}
		
		// 속도를 위반한 최댓값 계산
		int max=0;
		idx=0;
		
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int length = Integer.valueOf(st.nextToken());
			int speed = Integer.valueOf(st.nextToken());
			
			while(length-->0) {
				max = Math.max(max, speed-limit[idx++]);
			}
		}
		
		bw.write(Integer.toString(max));
		

		bw.close();
	} // end of main()
} // end of Main class