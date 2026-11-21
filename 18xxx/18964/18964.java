import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int n = Integer.valueOf(br.readLine());
		
		// 홀수와 짝수의 개수 확인
		int[] num = new int[2];
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(n-->0) {
			num[Integer.valueOf(st.nextToken())%2]++;
		}
		
		// 출력
		if(num[0]>num[1]) {
			bw.write("2 0");
		} else {
			bw.write("2 1");
		}
		
		bw.close();
	} // end of main()
} // end of Main class