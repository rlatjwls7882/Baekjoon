import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		while(true) {
			int N = Integer.valueOf(br.readLine());
			if(N==0) {
				break;
			}
			
			int max=0;
			for(int i=0;;i++) {
				int res = i*(i+1)*(i+2)/6;
				if(res>N) {
					break;
				}
				
				int remain = N-res;
				max = Math.max(max, res+(int)Math.pow((int)Math.cbrt(remain), 3));
			}
			bw.write(max+"\n");
		}

		bw.close();
	} // end of main()
} // end of Main class