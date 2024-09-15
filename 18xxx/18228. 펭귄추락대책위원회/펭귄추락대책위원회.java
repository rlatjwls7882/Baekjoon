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
		
		// 얼음의 개수 N
		int N = Integer.valueOf(br.readLine());
		
		// 펠귄을 떨어뜨릴 수 있는 최소 힘 계산
		StringTokenizer st = new StringTokenizer(br.readLine());
		int leftMin=1_000_000_000, rightMin=1_000_000_000;
		boolean isLeft=true;
		
		while(N-->0) {
			if(isLeft) {
				int A = Integer.valueOf(st.nextToken());

				if(A==-1) {
					isLeft=false;
					continue;
				}
				leftMin = Math.min(leftMin, A);
			} else {
				rightMin = Math.min(rightMin, Integer.valueOf(st.nextToken()));
			}
		}
		
		bw.write(Integer.toString(leftMin+rightMin));
		
		bw.close();
	} // end of main()
} // end of Main class