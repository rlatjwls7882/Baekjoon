import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		/* 정수 N을 1, 2, 3의 합으로 나타내는 방법의 수 계산
		 * 1(1) : 1
		 * 2(2) : 11 2
		 * 3(4) : 111 12(2) 3
		 * 4(7) : 
		 * 5(13) : 11111 1112(4) 122(3) 23(2) 113(3)
		 * ...
		 * f(N)=f(N-1)+f(N-2)+f(N-3)
		 */
		int[] f = new int[1_000_001];
		f[1]=1; f[2]=2; f[3]=4;
		
		for(int i=4;i<=1_000_000;i++) {
			f[i] = ((f[i-1]+f[i-2])%1_000_000_009+f[i-3])%1_000_000_009;
		}
		
		int T = Integer.valueOf(br.readLine());
		while(T-->0) {
			bw.write(Integer.toString(f[Integer.valueOf(br.readLine())]));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class