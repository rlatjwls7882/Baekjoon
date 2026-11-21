import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		HashMap<String, Boolean> artist = new HashMap<>();
		int cnt=0;
		while(N-->0) {
			String string = br.readLine();
			if(artist.containsKey(string)) {
				if(!artist.get(string)) {
					cnt++;
					artist.put(string, true);
				}
			} else {
				artist.put(string, false);
			}
		}
		bw.write(cnt+"");
		
		bw.close();
	} // end of main()
} // end of Main class