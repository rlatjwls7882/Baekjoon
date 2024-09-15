import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		// 자릿수 합의 최댓값 계산
		int max=0, maxRadix=2;
		for(int radix=2;radix<=N;radix++) {
			int sum=calcSum(N, radix);
			
			if(max<sum) {
				max=sum;
				maxRadix=radix;
			}
		}
		
		// 출력
		bw.write(max+" "+maxRadix);
		
		bw.close();
	} // end of main()
	
	static int calcSum(int N, int radix) {
		int sum=0;
		while(N!=0) {
			sum += N%radix;
			N /= radix;
		}
		
		return sum;
	} // end of calcSum()
} // end of Main class