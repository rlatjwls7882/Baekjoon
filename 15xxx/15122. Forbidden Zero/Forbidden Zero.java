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

		for(int i=N+1;;i++) {
			if(check(i)) {
				bw.write(Integer.toString(i));
				break;
			}
		}

		bw.close();
	} // end of main()

	static boolean check(int N) {
		while(N!=0) {
			if(N%10==0) {
				return false;
			}
			N/=10;
		}
		return true;
	} // end of check()
} // end of Main class