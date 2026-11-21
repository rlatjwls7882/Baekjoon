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
		
		// 샌드위치의 가격 S, 쿠기가 가지고 있는 금액 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 아리의 돈으로 살 수 있는 경우
		if((S&1023)>=S) {
			bw.write("No thanks");
		}
		
		// 쿠기의 도움을 받아서 살 수 있는 경우
		else if(((S-1023)&M)>=S-1023) {
			bw.write("Thanks");
		}
		
		// 살 수 없는 경우
		else {
			bw.write("Impossible");
		}
		
		bw.close();
	} // end of main()
} // end of Main class