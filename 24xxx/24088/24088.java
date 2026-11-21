import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		int K = Integer.valueOf(br.readLine());
		String S = br.readLine();
		
		for(int i=0;i<N-1;i++) {
			if(S.charAt(i)=='R') {
				K--;
			}
		}
		
		if(K==0) {
			bw.write('W');
		} else {
			bw.write('R');
		}
		
		bw.close();
	} // end of main()
} // end of Main class