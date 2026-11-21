import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		while(T-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int year = Integer.valueOf(st.nextToken());
			char num = st.nextToken().charAt(0);
			
			BigInteger fact = BigInteger.ONE;
			for(int i=1;i<=year;i++) {
				fact = fact.multiply(new BigInteger(Integer.toString(i)));
			}
			
			String string = fact.toString();
			int cnt=0;
			for(int i=0;i<string.length();i++) {
				if(string.charAt(i)==num) {
					cnt++;
				}
			}
			bw.write(cnt+"\n");
		}

		bw.close();
	} // end of main()
} // end of Main class