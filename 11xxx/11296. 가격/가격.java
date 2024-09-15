import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		String[] dots = {"R", "G", "B", "Y", "O", "W"};
		double[] discounts = {0.45, 0.3, 0.2, 0.15, 0.1, 0.05};
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double price = Double.valueOf(st.nextToken());
			String dot = st.nextToken();
			String coupon = st.nextToken();
			String pay = st.nextToken();
			
			double discount=0;
			for(int i=0;i<6;i++) {
				if(dots[i].equals(dot)) {
					discount=discounts[i];
					break;
				}
			}
			
			price *= 1-discount;
			if(coupon.equals("C")) {
				price*=0.95;
			}
			if(pay.equals("C")) {
				price -= 0.011;
			}
			
			if(pay.equals("P")) {
				bw.write(String.format("$%.02f\n", price));
			} else {
				bw.write(String.format("$%.01f", price));
				bw.write("0\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class