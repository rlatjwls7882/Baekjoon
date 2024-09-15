import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받은 수 이상, 10^9 이하의 합성수 출력
		bw.write("1000000000");

		bw.close();
	} // end of main()
} // end of Main class