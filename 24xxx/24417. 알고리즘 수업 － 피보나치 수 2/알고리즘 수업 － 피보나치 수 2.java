import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.valueOf(br.readLine());
		
		// n-1번째 피보나치수 계산
		int[] fib = new int[n];
		fib[0]=fib[1]=1;
		
		for(int i=2;i<n;i++)
			fib[i]=(int)(((long)fib[i-1]+fib[i-2])%1_000_000_007L);
		
		// 코드1번은 fib[n-1]번 반복함
		// 코드2번은 n-2번 반복함
		bw.write(fib[n-1]+" "+(n-2));

		bw.close();
	} // end of main()
} // end of Main class