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
		int E = Integer.valueOf(st.nextToken())%15;
		int S = Integer.valueOf(st.nextToken())%28;
		int M = Integer.valueOf(st.nextToken())%19;
		
		// N%15=E, N%28=S, N%19=M을 만족하는 N 계산
		for(int N=1;;N++) {
			if(N%15==E&&N%28==S&&N%19==M) {
				bw.write(Integer.toString(N));
				break;
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class