import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 40번째 피보나치수까지 0과 1이 출력되는 횟수 계산
		int[][] fib = new int[41][2];
		fib[0][0]=1;
		fib[1][1]=1;
		
		for(int i=2;i<=40;i++) {
			fib[i][0]=fib[i-1][0]+fib[i-2][0];
			fib[i][1]=fib[i-1][1]+fib[i-2][1];
		}
		
		// N번째 피보나치수가 출력하는 0과 1의 개수 출력
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			int N = Integer.valueOf(br.readLine());
			bw.write(Integer.toString(fib[N][0]));
			bw.write(' ');
			bw.write(Integer.toString(fib[N][1]));
			bw.newLine();
		}
		
		
		bw.close();
	} // end of main()
} // end of Main class