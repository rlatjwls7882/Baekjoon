import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int[] chars = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
		
		int T = Integer.valueOf(br.readLine());
		while(T-->0) {
			String string = br.readLine().replace("-", "");
			for(int i=0;i<10;i++) {
				if(i==3||i==6) {
					bw.write('-');
				}
				if(string.charAt(i)<='9') {
					bw.write(string.charAt(i));
				} else {
					bw.write(chars[string.charAt(i)-'A']+"");
				}
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class