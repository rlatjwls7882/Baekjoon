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
		long x = Long.valueOf(st.nextToken());
		long y = Long.valueOf(st.nextToken());
		long r = Long.valueOf(br.readLine());
		
		// 네 점의 좌표 출력
		bw.write(String.format("%d %d\n", x-r, y-r));
		bw.write(String.format("%d %d\n", x-r, y+r));
		bw.write(String.format("%d %d\n", x+r, y+r));
		bw.write(String.format("%d %d", x+r, y-r));
		
		bw.close();
	} // end of main()
} // end of Main class