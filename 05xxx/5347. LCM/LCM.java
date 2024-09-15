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

		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long A = Long.valueOf(st.nextToken());
			long B = Long.valueOf(st.nextToken());
			
			// A와 B의 최소공배수 계산
			long tmpA=A, tmpB=B;
			while(tmpB!=0) {
				long tmp = tmpA%tmpB;
				tmpA=tmpB;
				tmpB=tmp;
			}
			
			bw.write(Long.toString(A*B/tmpA));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class