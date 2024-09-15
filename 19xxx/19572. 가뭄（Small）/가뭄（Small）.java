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
		
		// d1 d2 d3 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		double d1 = Double.valueOf(st.nextToken());
		double d2 = Double.valueOf(st.nextToken());
		double d3 = Double.valueOf(st.nextToken());
		
		// a, b, c 계산
		
		// a+b=d1, a+c=d2, b+c=d3
		// 2(a+b+c) = d1+d2+d3
		
		// => c = (-d1+d2+d3)/2
		// => b = d3-c
		// => a = d1-b
		double c = (-d1+d2+d3)/2;
		double b = d3-c;
		double a = d1-b;
		
		// a, b, c가 모두 양수인지 확인
		if(a>0&&b>0&&c>0)
			bw.write(String.format("1\n%.01f %.01f %.01f", a, b, c));
		else
			bw.write("-1");
		
		bw.close();
	} // end of main()
} // end of Main class