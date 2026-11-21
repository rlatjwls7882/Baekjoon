import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 컵을 섞는 방법 입력
		String shuffle = br.readLine();

		// 공이 어디에 있는지 확인
		int ball = 1;

		for (int i = 0; i < shuffle.length(); i++) {
			if (ball == 1) {
				if (shuffle.charAt(i) == 'A') ball = 2;
				else if (shuffle.charAt(i) == 'C') ball = 3;
			} else if (ball == 2) {
				if (shuffle.charAt(i) == 'A') ball = 1;
				else if (shuffle.charAt(i) == 'B') ball = 3;
			} else {
				if (shuffle.charAt(i) == 'B') ball = 2;
				else if (shuffle.charAt(i) == 'C') ball = 1;
			}
		}

		bw.write(ball+"");
		bw.close();
	} // end of main
} // end of Main class