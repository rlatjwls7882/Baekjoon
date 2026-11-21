import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		// 두번째로 싼 가격 찾기
		double[] prices = new double[N];
		for(int i=0;i<N;i++) {
			prices[i] = Double.valueOf(br.readLine());
		}
		Arrays.sort(prices);
		
		bw.write(String.format("%.02f", prices[1]));
		
		bw.close();
	} // end of main()
} // end of Main class