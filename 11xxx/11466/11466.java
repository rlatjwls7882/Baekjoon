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
		
		// 종이의 가로 세로 크기
		StringTokenizer st = new StringTokenizer(br.readLine());
		double h = Double.valueOf(st.nextToken());
		double w = Double.valueOf(st.nextToken());
		
		// 정사각형의 최대 길이 계산
		double case1 = Math.min(h/3, w);
		double case2 = Math.min(h/2, w/2);
		double case3 = Math.min(h, w/3);
		
		bw.write(Double.toString(Math.max(Math.max(case1, case2), case3)));
		
		bw.close();
	} // end of main()
} // end of Main class