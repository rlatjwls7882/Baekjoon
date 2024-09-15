import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		// 가지고 있는 띠부띠부씰의 종류
		int N = Integer.valueOf(br.readLine());
		String string = br.readLine();
		
		int[] alpha = new int[26];
		for(int i=0;i<N;i++) {
			alpha[string.charAt(i)-'A']++;
		}
		
		// 배송 받을 수 있는 최대 골드칩 봉지 수 계산
		int[] bronzesilver = {1, 17, 14, 13, 4, 18, 8, 11, 21};
		alpha[4]/=2;
		alpha[17]/=2;
		int cnt=1000;
		
		for(int require:bronzesilver) {
			cnt = Math.min(cnt, alpha[require]);
		}
		
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class