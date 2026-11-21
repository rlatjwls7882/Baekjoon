import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 각 막대의 크기
		int a1 = Integer.valueOf(br.readLine());
		int a2 = Integer.valueOf(br.readLine());
		int a3 = Integer.valueOf(br.readLine());
		int a4 = Integer.valueOf(br.readLine());
		
		// 둘러싸일 수 있는 최대 영역 계산
		bw.write(Integer.toString(Math.min(a1, a2)*Math.min(a3, a4)));
		
		bw.close();
	} // end of main()
} // end of Main class