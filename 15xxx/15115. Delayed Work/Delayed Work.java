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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int K = Integer.valueOf(st.nextToken());
		int P = Integer.valueOf(st.nextToken());
		int X = Integer.valueOf(st.nextToken());
		
		double cost = 1_000_000_000;
		for(int M=1;;M++) {
			double curCost = K/(double)M*P+X*M;
			
			if(curCost<cost) {
				cost=curCost;
			} else {
				break;
			}
		}
		bw.write(String.format("%.03f", cost));
		
		bw.close();
	} // end of main()
} // end of Main class