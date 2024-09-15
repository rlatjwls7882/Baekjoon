import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			BigDecimal A = new BigDecimal(st.nextToken());
			BigDecimal B = new BigDecimal(st.nextToken());
			BigDecimal C = new BigDecimal(st.nextToken());
			BigDecimal D = new BigDecimal(st.nextToken());
			
			BigDecimal L = A.add(B.sqrt(MathContext.DECIMAL128));
			BigDecimal R = C.add(D.sqrt(MathContext.DECIMAL128));
			if(L.compareTo(R)>0) {
				bw.write("Greater\n");
			} else if(L.compareTo(R)<0) {
				bw.write("Less\n");
			} else {
				bw.write("Equal\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class