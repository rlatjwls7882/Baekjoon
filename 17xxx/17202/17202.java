import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 궁합을 볼 핸드폰 번호
		String A = br.readLine();
		String B = br.readLine();
		
		int[] phone = new int[16];
		for(int i=0;i<8;i++) {
			phone[i*2]=A.charAt(i)-'0';
			phone[i*2+1]=B.charAt(i)-'0';
		}
		
		// A와 B의 핸드폰 번호 궁합률 계산
		for(int i=15;i>1;i--)
			for(int j=0;j<i;j++)
				phone[j]=(phone[j]+phone[j+1])%10;
		
		bw.write(phone[0]+""+phone[1]);
		
		bw.close();
	} // end of main
} // end of Main class