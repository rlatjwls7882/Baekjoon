import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 얻을 수 있는 즐거움의 합(1~A-1의 합) 계산
		long A = Long.valueOf(br.readLine());
		bw.write((A-1)*A/2+"");
		
		bw.close();
	} // end of main()
} // end of Main class