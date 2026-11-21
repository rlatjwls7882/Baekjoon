import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long N = Long.valueOf(br.readLine());

		// 3킬로그램 봉지의 최소 개수 계산
		long bag=0;
		while(N>2&&N%5!=0) {
			bag++;
			N-=3;
		}
		
		// 배달하는 봉지의 최소 개수 출력
		if(N%5!=0)
			bw.write("-1");
		else
			bw.write(bag+N/5+"");

		bw.close();
	} // end of main()
} // end of Main class