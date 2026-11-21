import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 다섯 자리의 양수 n 입력
		String n = br.readLine();
		
		// 각 자리수의 다섯 제곱의 합 계산
		int sum=0;
		
		for(int i=0;i<5;i++)
			sum += Math.pow(n.charAt(i)-'0', 5);
		
		// 각 자리수의 다섯 제곱의 합 출력
		bw.write(sum+"");
		
		bw.close();
	} // end of main
} // end of Main class