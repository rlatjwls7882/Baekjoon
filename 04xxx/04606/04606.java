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

		HashMap<Character, String> map = new HashMap<>();
		map.put(' ', "%20");
		map.put('!', "%21");
		map.put('$', "%24");
		map.put('%', "%25");
		map.put('(', "%28");
		map.put(')', "%29");
		map.put('*', "%2a");

		while(true) {
			String string = br.readLine();
			if(string.equals("#")) {
				break;
			}

			for(int i=0;i<string.length();i++) {
				if(map.containsKey(string.charAt(i))) {
					bw.write(map.get(string.charAt(i)));
				} else {
					bw.write(string.charAt(i));
				}
			}
			bw.newLine();
		}

		bw.close();
	} // end of main()
} // end of Main class