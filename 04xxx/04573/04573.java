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
		
		for(int i=1;;i++) {
			int N = Integer.valueOf(br.readLine());
			if(N==0) {
				break;
			}
			double minCost=Double.MAX_VALUE;
			int minInch=0;
			
			while(N-->0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int inch = Integer.valueOf(st.nextToken());
				int price = Integer.valueOf(st.nextToken());
				double cost = price/((inch/2.)*(inch/2.)*Math.PI);
				if(cost<minCost) {
					minCost=cost;
					minInch=inch;
				}
			}
			bw.write("Menu "+i+": "+minInch+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class