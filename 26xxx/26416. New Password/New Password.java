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
		for(int i=1;i<=T;i++) {
			int N = Integer.valueOf(br.readLine());
			String string = br.readLine();
			
			boolean upper=false, lower=false, digit=false, special=false;
			for(int j=0;j<N;j++) {
				if('0'<=string.charAt(j)&&string.charAt(j)<='9') {
					digit=true;
				} else if('a'<=string.charAt(j)&&string.charAt(j)<='z') {
					lower=true;
				} else if('A'<=string.charAt(j)&&string.charAt(j)<='Z') {
					upper=true;
				} else {
					special=true;
				}
			}
			
			bw.write("Case #"+i+": "+string);
			if(!upper) {
				bw.write('A');
				N++;
			}
			if(!lower) {
				bw.write('a');
				N++;
			}
			if(!digit) {
				bw.write('0');
				N++;
			}
			if(!special) {
				bw.write('@');
				N++;
			}
			
			for(int j=N+1;j<=7;j++) {
				bw.write('0');
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class