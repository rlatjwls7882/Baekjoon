import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int M = Integer.valueOf(br.readLine());
		
		HashMap<String, Integer> cars = new HashMap<>();
		while(M-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int T = Integer.valueOf(st.nextToken());
			String N = st.nextToken();
			
			if(cars.containsKey(N)) {
				bw.write(N+" "+(T-cars.get(N))+"\n");
				cars.remove(N);
			} else {
				cars.put(N, T);
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class