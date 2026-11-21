import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		String rank = "A23456789TJQK";
		int n = Integer.valueOf(br.readLine());
		
		while(n-->0) {
			String string = br.readLine();
			
			// 같은 카드의 최대 개수 계산
			int[] cardCnt = new int[13];
			int k=0;
			
			for(int i=0;i<string.length();i+=3) {
				int idx = rank.indexOf(string.charAt(i));
				cardCnt[idx]++;
				
				k = Math.max(cardCnt[idx], k);
			}
			
			// 출력
			bw.write(Integer.toString(k));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class