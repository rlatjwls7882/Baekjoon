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
		
		// 어떤 수를 입력하든 1과 -1이 있기에 A는 B로 얼마든지 변할 수 있음
		while(T-->0) {
			bw.write("yes\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class