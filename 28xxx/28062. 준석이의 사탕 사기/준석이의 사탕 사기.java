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
		
		// 사탕 묶음의 개수 N
		int N = Integer.valueOf(br.readLine());

		// 가져갈 수 있는 사탕의 짝의 최댓값 계산
		int candy=0, minodd=1000;

		StringTokenizer st = new StringTokenizer(br.readLine());
		while(N-->0) {
			int a = Integer.valueOf(st.nextToken());
			candy += a;

			if(a%2==1) {
				minodd = Math.min(a, minodd);
			}
		}

		if(candy%2==0) {
			bw.write(Integer.toString(candy));
		} else {
			bw.write(Integer.toString(candy-minodd));
		}
		
		bw.close();
	} // end of main()
} // end of Main class