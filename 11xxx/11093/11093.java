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
			int size = (int)Math.ceil(Math.sqrt(string.length()));
			
			for(int i=0;i<size;i++) {
				for(int j=size-1;j>=0;j--) {
					if(size*j+i<string.length()) {
						bw.write(string.charAt(size*j+i));
					}
				}
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class