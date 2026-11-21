import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int n = Integer.valueOf(br.readLine());
		
		TreeMap<Character, Integer> list = new TreeMap<>();
		while(n-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char name = st.nextToken().charAt(0);
			int change = Integer.valueOf(st.nextToken());
			list.put(name, list.getOrDefault(name, 0)+change);
		}
		
		for(char name:list.keySet()) {
			bw.write(name+" "+list.get(name)+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class