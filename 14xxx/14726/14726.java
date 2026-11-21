import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {

		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			String string = br.readLine();
			
			// 모든 자리수의 합 계산
			int sum=0;
			
			for(int i=0;i<16;i++) {
				int cnt=0;
				if(i%2==0) {
					cnt=(string.charAt(i)-'0')*2;
				} else {
					cnt=string.charAt(i)-'0';
				}
				
				while(cnt!=0) {
					sum += cnt%10;
					cnt/=10;
				}
			}
			
			// 신용카드 번호가 유효한지 확인
			if(sum%10==0) {
				bw.write("T\n");
			} else {
				bw.write("F\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class