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
		
		// 총 팀의 수 N, 각 팀의 구성원의 수 M, 운동회에 남은 사람 a, 준혁이네 팀에서 남은 사람 K
		StringTokenizer st = new StringTokenizer(br.readLine());
		long N = Long.valueOf(st.nextToken());
		long M = Long.valueOf(st.nextToken());
		long a = Long.valueOf(st.nextToken());
		long K = Long.valueOf(st.nextToken());
		
		// 준혁이네 팀이 지금 가질 수 있는 최대, 최소 등수 계산
		bw.write(Long.toString(Math.min(N, a-K+1)));
		bw.write(' ');
		bw.write(Long.toString((long)Math.ceil((a-K)/(double)M)+1));
		
		bw.close();
	} // end of main()
} // end of Main class