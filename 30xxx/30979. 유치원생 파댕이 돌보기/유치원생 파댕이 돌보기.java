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
		
		int T = Integer.valueOf(br.readLine());
		int N = Integer.valueOf(br.readLine());
		
		// T분동안 울지 않게 만들 수 있는지 확인
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(N-->0) {
			T -= Integer.valueOf(st.nextToken());
		}
		
		if(T<=0) {
			bw.write("Padaeng_i Happy");
		} else {
			bw.write("Padaeng_i Cry");
		}
		
		bw.close();
	} // end of main()
} // end of Main class