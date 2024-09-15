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
		
		// 두 고리의 안쪽 반지름 a b, 바깥쪽 반지름 A B, 판의 반지름 P
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.valueOf(st.nextToken());
		int a = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		int b = Integer.valueOf(st.nextToken());
		int P = Integer.valueOf(st.nextToken());
		
		// 두 고리를 만들 수 있는지 확인
		// case1 : 고리 안에 고리가 있는 경우
		// case2 : 고리가 나란히 있는 경우
		if(P>=B&&b>=A||P>=A&&a>=B||P>=A+B) {
			bw.write("Yes");
		} else {
			bw.write("No");
		}
		
		bw.close();
	} // end of main()
} // end of Main class