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
			
			int idx=0;
			while(N-->0) {
				String string = br.readLine();
				while(idx<string.length()&&string.charAt(idx)!=' ') {
					idx++;
				}
			}
			bw.write(idx+1+"\n");
		}

		bw.close();
	} // end of main()
} // end of Main class