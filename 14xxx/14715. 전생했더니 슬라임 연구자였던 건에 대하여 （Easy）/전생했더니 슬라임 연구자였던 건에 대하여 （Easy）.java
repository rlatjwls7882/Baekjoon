import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 슬라임의 에너지 K 입력
		int K = Integer.valueOf(br.readLine());
		
		// K를 소인수분해 하여 소인수의 개수 확인
		int cnt=0;
		for(int i=2;i<=K;i++) {
			while(K%i==0) {
				cnt++;
				K/=i;
			}
		}
		
		// 가장 많이 생긴 흠집의 최소값(log₂(cnt)) 계산
		bw.write(Integer.toString(32-Integer.numberOfLeadingZeros(cnt-1)));
		
		bw.close();
	} // end of main()
} // end of Main class