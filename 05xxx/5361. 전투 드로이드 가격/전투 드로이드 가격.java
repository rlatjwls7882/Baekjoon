import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		DecimalFormat format = new DecimalFormat("$0.00");
		
		int T = Integer.valueOf(bf.readLine());
		
		while(T--!=0) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			
			double requireMoney
					=Double.valueOf(st.nextToken())*350.34
					+Double.valueOf(st.nextToken())*230.9
					+Double.valueOf(st.nextToken())*190.55
					+Double.valueOf(st.nextToken())*125.3
					+Double.valueOf(st.nextToken())*180.9;
			
			bw.write(format.format(requireMoney)+"\n");
		}
		
		bw.close();
	} // end of main
} // end of main class