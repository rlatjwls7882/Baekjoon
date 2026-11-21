import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.valueOf(bf.readLine());
		DecimalFormat format = new DecimalFormat("$0.00");
		
		while(N--!=0) {
			double A = Double.valueOf(bf.readLine());
			
			bw.write(format.format(A*0.8)+"\n");
		}
		
		bw.close();
	} // end of main
} // end of main class