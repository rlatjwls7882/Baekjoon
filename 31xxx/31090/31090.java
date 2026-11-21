import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		
		// N+1이 N%100으로 나누어지는지 확인
		while(T-->0) {
			int N = Integer.valueOf(br.readLine());
			
			if((N+1)%(N%100)==0) {
				bw.write("Good\n");
			} else {
				bw.write("Bye\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class