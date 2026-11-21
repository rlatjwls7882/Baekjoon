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
		DecimalFormat df = new DecimalFormat("$0.00");
		
		int n = Integer.valueOf(bf.readLine());
		
		while(n--!=0) {
			double sum = 0;
			int x = Integer.valueOf(bf.readLine());
			
			while(x--!=0) {
				st = new StringTokenizer(bf.readLine());
				st.nextToken();
				sum += Double.valueOf(st.nextToken())*Double.valueOf(st.nextToken());
			}
	
			bw.write(df.format(sum)+"\n");
		}
		bw.close();
	} // end of main
} // end of main class