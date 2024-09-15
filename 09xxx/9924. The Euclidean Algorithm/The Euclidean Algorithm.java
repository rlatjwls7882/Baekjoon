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
		
		// A B 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		
		if(A<B) {
			int tmp=A;
			A=B;
			B=tmp;
		}
		
		// 유클리드 알고리즘의 실행횟수 계산
		int cnt=0;
		while(A!=B) {
			int tmp=A-B;
			A=Math.max(B, tmp);
			B=Math.min(B, tmp);
			cnt++;
		}
		
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class