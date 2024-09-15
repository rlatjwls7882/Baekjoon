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

		// 페이지의 크기
		StringTokenizer st = new StringTokenizer(br.readLine());
		int w = Integer.valueOf(st.nextToken());
		int h = Integer.valueOf(st.nextToken());
		
		// 글자수, 글자의 너비와 높이
		st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int a = Integer.valueOf(st.nextToken());
		int b = Integer.valueOf(st.nextToken());
		
		// 일기의 페이지 수 계산
		int charInPage = (w/a)*(h/b);
		
		if(charInPage==0) bw.write("-1");
		else bw.write((n+charInPage-1)/charInPage+"");
		
		bw.close();
	} // end of main
} // end of Main class