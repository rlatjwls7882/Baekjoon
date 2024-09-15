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
		
		// 기계의 길이 N
		int N = Integer.valueOf(br.readLine());
		
		// 동전의 처음 위치 (x, y)
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.valueOf(st.nextToken());
		int y = Integer.valueOf(st.nextToken());
		
		// 기계의 최소 작동 횟수 계산
		if(N==1) {
			bw.write("0");
		} else if(x==1&&y==1||x==N&&y==N||x==1&&y==N||x==N&&y==1) {
			bw.write("2");
		} else if(x==1||x==N||y==1||y==N) {
			bw.write("3");
		} else {
			bw.write("4");
		}
		
		bw.close();
	} // end of main()
} // end of Main class