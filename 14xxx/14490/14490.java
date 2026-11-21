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

		// n:m 입력
		StringTokenizer st = new StringTokenizer(br.readLine(),":");
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		
		// n과 m의 최대공약수 계산
		int tmpn=n, tmpm=m;
		while(tmpm!=0) {
			int tmp = tmpn%tmpm;
			tmpn = tmpm;
			tmpm = tmp;
		}
		
		// n:m을 최대한 약분하여 출력
		bw.write(String.format("%d:%d", n/tmpn, m/tmpn));
		
		bw.close();
	} // end of main()
} // end of Main class