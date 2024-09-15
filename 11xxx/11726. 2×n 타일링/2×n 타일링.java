import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		/*
		 * 1(1) : 1
		 * 2(2) : 11 00
		 * 3(3) : 111 100 001
		 * 4(5) : 0000 0011 1001 1100 1111
		 * 5(8) : 10000 00100 00001 11100 11001 10011 00111 11111
		 * ...
		 */
		
		// 2*n 크기의 직사각형을 채우는 방법의 수 계산
		int n = Integer.valueOf(br.readLine());
		int[] method = new int[n+2];
		method[0]=1;
		method[1]=2;
		
		for(int i=2;i<n;i++) {
			method[i]=(method[i-1]+method[i-2])%10007;
		}
		
		bw.write(Integer.toString(method[n-1]));
		
		bw.close();
	} // end of main()
} // end of Main class