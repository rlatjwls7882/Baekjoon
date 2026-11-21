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
		
		if(N<=1) {
			bw.write("1");
		} else if(N<=3) {
			bw.write("2");
		} else if(N<=6) {
			bw.write("3");
		} else if(N<=10) {
			bw.write("4");
		} else if(N<=15) {
			bw.write("5");
		} else if(N<=21) {
			bw.write("6");
		} else {
			long res = N%7==0?N/7+3:N/7+4;
			bw.write(res+"");
		}
		
		bw.close();
	} // end of main()
} // end of Main class