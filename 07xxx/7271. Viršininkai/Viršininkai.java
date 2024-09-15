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
		
		// 프로그래머의 수 N, 개혁 전 프로젝트 수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 출력
		bw.write(String.format("%d %d %d\n", N-1, M, N-1));
		
		// 기존의 프로젝트 모두 종료
		while(M-->0) {
			bw.write(br.readLine());
			bw.newLine();
		}
		
		// 모든 사람이 1과 프로젝트 진행
		for(int i=2;i<=N;i++) {
			bw.write(String.format("1 %d\n", i));
		}
		
		bw.close();
	} // end of main()
} // end of Main class