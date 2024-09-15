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
		
		while(T-->0) {
			int N = Integer.valueOf(br.readLine());
			String string = br.readLine();
			
			boolean lower=false, upper=false, digit=false, symbol=false;
			for(int i=0;i<N;i++) {
				if('a'<=string.charAt(i)&&string.charAt(i)<='z') {
					lower=true;
				} else if('A'<=string.charAt(i)&&string.charAt(i)<='Z') {
					upper=true;
				} else if('0'<=string.charAt(i)&&string.charAt(i)<='9') {
					digit=true;
				} else {
					symbol=true;
				}
			}
			
			if(lower&&upper&&digit&&symbol&&N>=12) {
				bw.write("valid\n");
			} else {
				bw.write("invalid\n");
			}
		}

		bw.close();
	} // end of main()
} // end of Main class