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

		// 테스트 케이스의 수
		int T = Integer.valueOf(br.readLine());

		while (T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			// 화성 수학식의 결과 계산
			double input = Double.valueOf(st.nextToken());

			while (st.hasMoreTokens()) {
				char opt = st.nextToken().charAt(0);

				if (opt=='@')
					input *= 3;
				else if (opt=='%')
					input += 5;
				else
					input -= 7;
			}

			// 화성 수학식의 결과 출력
			bw.write(String.format("%.2f\n", input));
		}

		bw.close();
	} // end of main
} // end of Main class
