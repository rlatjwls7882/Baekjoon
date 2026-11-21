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
		
		// 길이가 N인 2진 수열의 개수 계산
		/*
		 * 1(1) : 1
		 * 2(2) : 11 00
		 * 3(3) : 111 100 001
		 * 4(5) : 1111 1100 1001 0011 0000
		 * 5(8) : 11111 11100 11001 10011 10011 00111 10000 00001
		 */
		
		int[] arr = new int[N+2];
		arr[0]=1;
		arr[1]=2;
		for(int i=2;i<N;i++) {
			arr[i]=(arr[i-1]+arr[i-2])%15746;
		}
		
		bw.write(Integer.toString(arr[N-1]));
		
		bw.close();
	} // end of main()
} // end of Main class
