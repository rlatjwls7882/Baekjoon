import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int Z = Integer.valueOf(br.readLine());
		
		while(Z-->0) {
			long K = Long.valueOf(br.readLine());
			if(K==Long.highestOneBit(K)) {
				bw.write("0\n");
			} else {
				String bin = Long.toBinaryString(K);
				int firstIdx = bin.indexOf('1')-1;
				int lastIdx = bin.lastIndexOf('1');
				
				bw.write(lastIdx-firstIdx+"\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class