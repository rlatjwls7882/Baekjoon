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
		
		int n = Integer.valueOf(br.readLine());
		
		String maxName="";
		int maxCost=0;
		while(n-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int cost = Integer.valueOf(st.nextToken());
			String name = st.nextToken();
			String country = st.nextToken();
			if(country.equals("Russia")&&maxCost<cost) {
				maxCost=cost;
				maxName=name;
			}
		}
		bw.write(maxName);
		
		bw.close();
	} // end of main()
} // end of Main class