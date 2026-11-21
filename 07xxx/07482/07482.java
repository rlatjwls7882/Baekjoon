import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			
			// 부피가 최대가 되게 하는 b 계산
			// 부피 V = (a-2b)²b
			// b에 대해 미분하면 V' = (6b-a)(2b-a)
			// V = (a-2b)²b 그래프가 b=a/6에서 극댓값을, b=a/2에서 극솟값을 가짐
			
			double a = Double.valueOf(br.readLine());
			bw.write(String.format("%.010f\n", a/6));
		}
		
		bw.close();
	} // end of main()
} // end of Main class