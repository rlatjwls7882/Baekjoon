import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		char[] num = br.readLine().toCharArray();
		Arrays.sort(num);
		
		for(int i=num.length-1;i>=0;i--) {
			bw.write(num[i]);
		}
		
		bw.close();
	} // end of main()
} // end of Main class