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
			StringTokenizer st = new StringTokenizer(br.readLine());
			int first = Integer.valueOf(st.nextToken());
			if(first==0) {
				break;
			}
			
			HashMap<Integer, Integer> map = new HashMap<>();
			map.put(first, 1);
			
			for(int i=0;i<11;i++) {
				first = Integer.valueOf(st.nextToken());
				map.put(first, map.getOrDefault(first, 0)+1);
			}
			
			boolean chk=true;
			for(int val:map.values()) {
				if(val%4!=0) {
					chk=false;
					break;
				}
			}
			
			if(chk) {
				bw.write("yes\n");
			} else {
				bw.write("no\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class