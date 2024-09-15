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
		int absN = Math.abs(N);
		
		// 피보나치 수 계산
		int[] F = new int[absN+2];
		F[0]=0; F[1]=1;
		
		for(int i=2;i<=absN;i++)
			F[i]=(F[i-1]+F[i-2])%1_000_000_000;
		
		// 양수 음수 판별
		if(N==0) bw.write("0\n");
		else if(N<0&&N%2==0) bw.write("-1\n");
		else bw.write("1\n");
		
		bw.write(F[absN]+"");
		
		bw.close();
	} // end of main
} // end of Main class