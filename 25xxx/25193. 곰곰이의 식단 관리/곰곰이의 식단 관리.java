import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 식단을 정할 일의 수 N, 음식 S
		int N = Integer.valueOf(br.readLine());
		String S = br.readLine();
		
		// 치킨을 먹는 날의 수
		int chicken=0;
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)=='C') {
				chicken++;
			}
		}
		
		// 곰곰이가 연속으로 치킨을 먹는 날의 최솟값 계산
		// = Math.ceil(chicken/(N-chicken+1))
		bw.write(Integer.toString(N/(N-chicken+1)));
		
		bw.close();
	} // end of main()
} // end of Main class