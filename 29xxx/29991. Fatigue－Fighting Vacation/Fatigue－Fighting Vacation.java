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
		
		// 피로도 D, 피곤한 활동 수 C, 상쾌한 활동 수 R
		StringTokenizer st = new StringTokenizer(br.readLine());
		int D = Integer.valueOf(st.nextToken());
		int C = Integer.valueOf(st.nextToken());
		int R = Integer.valueOf(st.nextToken());
		
		// 피로도가 떨어지는 활동
		int[] bad = new int[C];
		for(int i=0;i<C;i++) {
			bad[i] = Integer.valueOf(br.readLine());
		}
		
		// 피로도가 올라가는 활동
		int cnt=R;
		while(R-->0) {
			D += Integer.valueOf(br.readLine());
		}
		
		// 피로도가 떨어지는 활동 수행
		for(int i=0;i<C;i++) {
			if(D-bad[i]>=0) {
				D -= bad[i];
				cnt++;
			} else {
				break;
			}
		}
		
		// 한 활동의 수 출력
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class