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
			if(N==-1) {
				break;
			}
			String string = Integer.toBinaryString(N);
			
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<32-string.length();i++) {
				sb.append("0");
			}
			sb.append(string);
			
			bw.write(Long.valueOf(sb.reverse().toString(), 2)+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class