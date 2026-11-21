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

		// 얼룩말의 개체 수 N, 얼룩말의 몸통 길이 L
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int L = Integer.valueOf(st.nextToken());
		
		// 가장 아름다운 얼룩말과 그 얼룩말의 개체수 계산
		int maxStripe=-1, cnt=0;
		while(N-->0) {
			String zebra = br.readLine();
			
			// 이 얼룩말의 줄무니 개수 계산
			int thisStripe=0;
			char last = '0';
			for(int i=0;i<L;i++) {
				if(last=='0'&&zebra.charAt(i)=='1') {
					thisStripe++;
					last='1';
				} else if(zebra.charAt(i)=='0') {
					last='0';
				}
			}
			
			// 얼룩말의 최대 줄무니 개수와 개체수 계산
			if(maxStripe<thisStripe) {
				maxStripe=thisStripe;
				cnt=1;
			} else if(maxStripe==thisStripe) {
				cnt++;
			}
		}
		
		bw.write(Integer.toString(maxStripe));
		bw.write(' ');
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class