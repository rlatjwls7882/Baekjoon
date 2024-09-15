import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.valueOf(br.readLine());
		
		// 피보나치 수 계산
		int[] F = new int[N+2];
		F[0]=0; F[1]=1;
		
		for(int i=2;i<=N;i++)
			F[i]=(F[i-1]+F[i-2])%1_000_000_007;
		
		bw.write(F[N]+"");
		
		bw.close();
	} // end of main
} // end of Main class