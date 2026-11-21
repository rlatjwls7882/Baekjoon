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
		int a = Math.abs(Integer.valueOf(st.nextToken()));
		int b = Math.abs(Integer.valueOf(st.nextToken()));
		int c = Integer.valueOf(st.nextToken());
		
		// c번 점프 후 (a, b) 위에 있을 수 있는지 확인
		if(a+b<=c&&(c-a-b)%2==0) {
			bw.write("YES");
		} else {
			bw.write("NO");
		}
		
		bw.close();
	} // end of main()
} // end of Main class