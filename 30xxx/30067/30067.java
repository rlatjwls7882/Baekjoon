import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 수 10개의 합 계산
		int sum=0;
		
		for(int i=0;i<10;i++)
			sum += Integer.valueOf(br.readLine());
		
		// 9개 수의 합 출력
		bw.write(sum/2+"");

		bw.close();
	} // end of main()
} // end of Main class