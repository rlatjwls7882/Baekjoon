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
		
		// 두개의 분수 입력(A/B, C/D)
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int C = Integer.valueOf(st.nextToken());
		int D = Integer.valueOf(st.nextToken());
		
		// A/B + C/D 계산
		A = A*D+B*C;
		B *= D;
		
		// A/B + C/D를 기약분수 형태로 출력
		int gcd = gcd(A, B);
		bw.write((A/gcd)+" "+(B/gcd));

		bw.close();
	} // end of main()
	
	public static int gcd(int A, int B) {
		
		if(A<B) {
			int tmp = A;
			A = B;
			B = tmp;
		}
		
		while(B!=0) {
			int tmp = A%B;
			A = B;
			B = tmp;
		}
		
		return A;
	} // end of gcd()
} // end of Main class