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
		
		// 맵의 크기 N*M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// (0, 0)에서 (N, M)으로 이동할 때 가져와야 할 쓰레기의 양 계산
		st = new StringTokenizer(br.readLine());
		long trash=0;
		
		while(N-->0) {
			trash += Long.valueOf(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		while(M-->0) {
			trash += Long.valueOf(st.nextToken());
		}
		
		bw.write(Long.toString(trash));
		
		bw.close();
	} // end of main()
} // end of Main class