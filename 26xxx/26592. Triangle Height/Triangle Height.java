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
		StringTokenizer st;
		
		int N = Integer.valueOf(bf.readLine());
		
		while(N--!=0) {
			st = new StringTokenizer(bf.readLine());
			double output = Double.valueOf(st.nextToken()) / Double.valueOf(st.nextToken()) *2;
			
			DecimalFormat df = new DecimalFormat("0.00");
			bw.write("The height of the triangle is ");
			bw.write(df.format(output)+" units\n");
		}
		bw.close();
	} // end of main
} // end of main class