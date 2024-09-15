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
		
		while(N-->0) {
			String string = br.readLine();
			
			int appear=1;
			for(int i=1;i<string.length();i++) {
				if(string.charAt(i)==string.charAt(i-1)) {
					appear++;
				} else {
					bw.write(appear+" "+string.charAt(i-1)+" ");
					appear=1;
				}
			}
			bw.write(appear+" "+string.charAt(string.length()-1)+" ");
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class