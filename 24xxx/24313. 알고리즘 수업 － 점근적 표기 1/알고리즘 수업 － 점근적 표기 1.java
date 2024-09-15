import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// a1, a0, c, n0 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a1 = Integer.valueOf(st.nextToken());
		int a0 = Integer.valueOf(st.nextToken());
		int c = Integer.valueOf(br.readLine());
		int n0 = Integer.valueOf(br.readLine());
		
		// O(n) 정의를 만족하는지 확인
		
		// a1*n+a0 <= c*n
		// => a1-c<=0 && n >= -a0/(a1-c) && 모든 n에 대하여 n >= n0
		// => a1-c<=0 && n0 >= -a0/(a1-c)
		
		if(a1-c<=0&&n0*(a1-c)<=-a0)
			bw.write("1");
		else
			bw.write("0");
		
		bw.close();
	} // end of main
} // end of Main class