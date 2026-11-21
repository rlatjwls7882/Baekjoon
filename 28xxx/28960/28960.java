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
		
		// 빨랫줄이 있는 높이 h, 빨랫줄의 길이 l, 망토의 크기 a*b
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.valueOf(st.nextToken());
		int l = Integer.valueOf(st.nextToken());
		int a = Integer.valueOf(st.nextToken());
		int b = Integer.valueOf(st.nextToken());
		
		// 빨랫줄에 망토를 접어서 널 수 있는지 확인
		if((a<=h*2&&b<=l)||(b<=h*2&&a<=l))
			bw.write("YES");
		else
			bw.write("NO");
		
		bw.close();
	} // end of main()
} // end of Main class