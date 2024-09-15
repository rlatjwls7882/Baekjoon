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
		
		int N = Integer.valueOf(br.readLine());
		
		StringTokenizer shirt_size = new StringTokenizer(br.readLine());
		StringTokenizer TnP = new StringTokenizer(br.readLine());
		
		// 티셔츠 구매 횟수 계산
		int T = Integer.valueOf(TnP.nextToken());
		int buy=0;
		
		for(int i=0;i<6;i++) {
			buy += (Integer.valueOf(shirt_size.nextToken())+T-1)/ T;
		}
		
		bw.write(Integer.toString(buy));
		bw.newLine();
		
		// 펜 묶음 구매수와 한자루씩 구매수 계산
		int P = Integer.valueOf(TnP.nextToken());
		
		bw.write(Integer.toString(N/P));
		bw.write(' ');
		bw.write(Integer.toString(N%P));
		
		bw.close();
	} // end of main()
} // end of Main class