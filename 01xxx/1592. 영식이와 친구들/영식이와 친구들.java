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
		int L = Integer.valueOf(st.nextToken());

		// 공던지기 게임에서 공을 던진 횟수 계산
		int throwCnt=0, idx=0;
		int[] getBall = new int[N];
		getBall[0]=1;
		
		while(true) {
			
			// M번 공을 받는 사람이 나오면 종료
			if(getBall[idx]==M) {
				break;
			}
			
			// 다음으로 받는 사람 계산
			if(getBall[idx]%2==0) {
				idx += N-L;
			} else {
				idx += L;
			}
			
			// 공 던지기
			idx%=N;
			getBall[idx]++;
			throwCnt++;
		}
		
		bw.write(Integer.toString(throwCnt));
		
		bw.close();
	} // end of main()
} // end of Main class