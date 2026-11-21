import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int k = Integer.valueOf(br.readLine());
		
		for(int i=1;;i++) {
			String cur = new BigInteger(Integer.toString(i)).pow(3).toString();
			if(cur.length()>=k) {
				bw.write(cur.charAt(k-1));
				break;
			}
			k -= cur.length();
		}
		
		bw.close();
	} // end of main()
} // end of Main class