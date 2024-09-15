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
			int move = br.readLine().charAt(0)-string.charAt(0)+26;
			
			for(int i=0;i<N;i++) {
				bw.write((string.charAt(i)-97+move)%26+97);
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class