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
		DecimalFormat df = new DecimalFormat("0.0");
		
		int N = Integer.valueOf(bf.readLine());
		
		while(N--!=0) {
			st = new StringTokenizer(bf.readLine());
			double A = Double.valueOf(st.nextToken());
			double B = Double.valueOf(st.nextToken());
			double distance = Math.abs(A-B);
			
			bw.write(df.format(distance)+"\n");
		}
		bw.close();
	} // end of main
} // end of main class