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
		int A = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		
		int cnt=0;
		if(A<K||B<K) {
			cnt=0;
		} else if(A>=2*K&&B>=2*K) {
			cnt = (A/K + (B-2*K)/K)*2;
		} else if(A>=2*K) {
			cnt = A/K;
		} else {
			cnt = B/K;
		}
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class