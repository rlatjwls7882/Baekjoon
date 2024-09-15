import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		// 정 N각형의 꼭짓점으로 이어 만들 수 있는 별의 개수 계산
		// = NC5
        long N = Long.valueOf(br.readLine());
        
        bw.write(Long.toString(N*(N-1)*(N-2)*(N-3)*(N-4)/120));
		
		bw.close();
	} // end of main()
} // end of Main class