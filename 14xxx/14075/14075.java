import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		String card = br.readLine();
		
		// 자릿수의 합 계산
		int sum=0;
		for(int i=0;i<card.length();i++) {
			if(i%2==0) {
				int tmp = (card.charAt(i)-'0')*2;
				
				while(tmp!=0) {
					sum += tmp%10;
					tmp/=10;
				}
			} else {
				sum += card.charAt(i)-'0';
			}
		}
		
		// 카드가 유효한지 확인
		if(sum%10==0) {
			bw.write("DA");
		} else {
			bw.write("NE");
		}
		
		bw.close();
	} // end of main()
} // end of Main class