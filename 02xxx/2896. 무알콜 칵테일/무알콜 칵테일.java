import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		double A = Double.valueOf(st.nextToken());
		double B = Double.valueOf(st.nextToken());
		double C = Double.valueOf(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		double I = Double.valueOf(st.nextToken());
		double J = Double.valueOf(st.nextToken());
		double K = Double.valueOf(st.nextToken());
		
		// 칵테일을 최대한 많이 만들었는때 남는 주스의 양 계산
		double max = Math.min(Math.min(A/I, B/J), C/K);
		bw.write(String.format("%f %f %f", A-max*I, B-max*J, C-max*K));
		
		bw.close();
	} // end of main()
} // end of Main class