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
		
		int t = Integer.valueOf(br.readLine());
		
		while(t-->0) {			
			int n = Integer.valueOf(br.readLine());
			
			HashMap<String, Integer> map = new HashMap<>();
			while(n-->0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String name = st.nextToken();
				String type = st.nextToken();
				map.put(type, map.getOrDefault(type, 1)+1);
			}
			
			int mult=1;
			for(String type:map.keySet()) {
				mult*=map.get(type);
			}
			bw.write((mult-1)+"\n");
		}

		bw.close();
	} // end of main
} // end of Main class