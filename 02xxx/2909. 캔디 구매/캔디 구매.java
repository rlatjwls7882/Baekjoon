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

		StringTokenizer st = new StringTokenizer(br.readLine());
		double C = Double.valueOf(st.nextToken());
		double K = Double.valueOf(st.nextToken());
		K = Math.pow(10, K);
		
		// 상근이가 내야 하는 가격 계산
		bw.write((long)(Math.round(C/K)*K)+"");

		bw.close();
	} // end of main
} // end of Main class