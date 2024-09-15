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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		HashMap<String, String> map = new HashMap<>();
		while(N-->0) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			String name = st.nextToken();
			String sound = st.nextToken()+" "+st.nextToken()+" "+st.nextToken();
			
			if(map.containsKey(sound)) {
				map.put(sound, "?\n");
			} else {
				map.put(sound, name+"\n");
			}
		}
		
		while(M-->0) {
			String sound = br.readLine();
			bw.write(map.getOrDefault(sound, "!\n"));
		}
		
		bw.close();
	} // end of main()
} // end of Main class