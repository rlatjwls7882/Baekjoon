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
		
		while(true) {
			String string = br.readLine();
			if(string==null) {
				break;
			}
			int N = Integer.valueOf(string);
			
			HashMap<String, Integer> map = new HashMap<>();
			int cnt=0;
			while(N-->0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String M = st.nextToken();
				String L = st.nextToken();
				if(L.equals("D")) {
					if(map.getOrDefault(M, 0)<0) {
						cnt++;
					}
					map.put(M, map.getOrDefault(M, 0)+1);
				} else {
					if(map.getOrDefault(M, 0)>0) {
						cnt++;
					}
					map.put(M, map.getOrDefault(M, 0)-1);
				}
			}
			bw.write(cnt+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class