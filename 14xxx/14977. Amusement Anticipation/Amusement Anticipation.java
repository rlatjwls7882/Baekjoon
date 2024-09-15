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
		
		while(true) {
			String string = br.readLine();
			if(string==null) {
				break;
			}
			
			Integer N = Integer.valueOf(string);
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] X = new int[N+1];
			for(int i=1;i<=N;i++) {
				X[i] = Integer.valueOf(st.nextToken());
			}
			
			int idx=Math.max(1, N-1);
			for(int i=N-2;i>0;i--) {
				if(X[i+2]-X[i+1]==X[i+1]-X[i]) {
					idx=i;
				} else {
					break;
				}
			}
			bw.write(idx+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class