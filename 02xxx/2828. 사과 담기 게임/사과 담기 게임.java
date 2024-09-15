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
		
		// 스크린의 크기 N, 바구니의 크기 M, 사과의 개수 J
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken())-1;
		int J = Integer.valueOf(br.readLine());
		
		// 바구니가 이동해야 하는 거리의 최솟값 계산
		int bucket_pos=1, move=0;
		
		while(J-->0) {
			int apple_pos = Integer.valueOf(br.readLine());
			
			if(apple_pos>bucket_pos) {
				int next_pos = apple_pos-M;
				if(next_pos>bucket_pos) {
					move += next_pos-bucket_pos;
					bucket_pos = next_pos;
				}
			} else {
				int next_pos = apple_pos;
				if(next_pos<bucket_pos) {
					move += bucket_pos-next_pos;
					bucket_pos = next_pos;
				}
			}
		}
		
		bw.write(Integer.toString(move));
		
		bw.close();
	} // end of main()
} // end of Main class