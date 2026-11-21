import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 원의 넓이
		double a = Double.valueOf(br.readLine());
		
		// 정사각형의 넓이 계산
		a = Math.sqrt(a/Math.PI);
		a = 4*(a+1)*(a+1);
		
		bw.write(Double.toString(a));
		
		bw.close();
	} // end of main()
} // end of Main class