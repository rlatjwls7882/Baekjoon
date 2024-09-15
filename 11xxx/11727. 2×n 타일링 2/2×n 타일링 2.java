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
		 * 1(1) : 0
		 * 2(3) : 00 1 2
		 * 3(5) : 000 01 10 20 02
		 * 4(11) : 0000 001 010 100 11 200 020 002 21 12 22
		 * 5(21) : 00000 0001 0010 0100 1000 011 101 110 0002 0020 0200 2000 012 021 102 120 201 210 022 202 220
		 * ...
		 */
		
		// 2*n크기의 직사각형을 채우는 방법의 수 계산
		int n = Integer.valueOf(br.readLine());
		
		int[] method = new int[n+1];
		method[1]=1;
		
		for(int i=2;i<=n;i++) {
			if(i%2==0) {
				method[i]=(method[i-1]*2+1)%10007;
			} else {
				method[i]=(method[i-1]*2-1)%10007;
			}
		}
		
		bw.write(Integer.toString(method[n]));
		
		bw.close();
	} // end of main()
} // end of Main class