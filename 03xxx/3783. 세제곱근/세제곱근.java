import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
	public static void main(String[] args) throws IOException {
		
		int t = Integer.valueOf(br.readLine());
		while(t-->0) {
			BigDecimal n = new BigDecimal(br.readLine());
			
			BigDecimal left = new BigDecimal("0");
			BigDecimal right = new BigDecimal("10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
			while(left.compareTo(right)<0) {
				BigDecimal mid = (left.add(right)).divide(new BigDecimal("2"), 200, RoundingMode.FLOOR);
				if(mid.pow(3).compareTo(n)<0) left = mid;
				else right = mid;

				if(right.subtract(left).compareTo(new BigDecimal("0.0000000001"))<0) {
					left = left.divide(BigDecimal.ONE, 10, RoundingMode.FLOOR);
					while(left.add(new BigDecimal("0.0000000001")).pow(3).compareTo(n)<=0) {
						left = left.add(new BigDecimal("0.0000000001"));
					}
					break;
				}
			}
			bw.write(left.divide(BigDecimal.ONE, 10, RoundingMode.FLOOR).toPlainString()+"\n");
		}
		
        bw.close();
    } // end of main
} // end of Main