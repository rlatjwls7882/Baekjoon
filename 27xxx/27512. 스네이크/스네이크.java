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
		
		// 맵의 크기 n*m 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		
		// 최고의 전략을 유지할 수 있는 뱀의 최대 크기 출력
		if(n*m%2==0) {
			bw.write(Integer.toString(n*m));
		} else {
			bw.write(Integer.toString(n*m-1));
		}
		
		bw.close();
	} // end of main()
} // end of Main class