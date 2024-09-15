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
		
		// 피보나치 비스무리한 수열 계산
		long[] F = new long[N+3];
		F[1]=F[2]=F[3]=1;
		
		for(int i=4;i<=N;i++)
			F[i]=F[i-1]+F[i-3];
		
		bw.write(F[N]+"");
		
		bw.close();
	} // end of main
} // end of Main class