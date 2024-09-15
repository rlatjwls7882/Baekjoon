import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		long N = Long.valueOf(br.readLine());
		
		// 모든 정점 사이의 거리의 합이 최소가 되도록 연결
		// = (N-1)+2*(N-1)C2
		// = (N-1)^2
		bw.write(Long.toString((N-1)*(N-1)));
		bw.newLine();
		
		for(int i=2;i<=N;i++) {
			bw.write(Integer.toString(i));
			bw.write(" 1\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class