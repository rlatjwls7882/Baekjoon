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
		
		// 숟가락 하나를 자르는 시간 A, 숟가락 하나를 칠하는 시간 B
		StringTokenizer st = new StringTokenizer(br.readLine());
		double A = 24/Double.valueOf(st.nextToken());
		double B = 24/Double.valueOf(st.nextToken());
		
		// 하루동안 생산할 수 있는 숟가락의 수 계산
		double spoon = 24/(A+B);
		bw.write(Integer.toString((int)Math.floor(spoon)));
		
		bw.close();
	} // end of main()
} // end of Main class