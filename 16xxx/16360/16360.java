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

		HashMap<String, String> change = new HashMap<>();
		change.put("a", "as");
		change.put("i", "ios");
		change.put("y", "ios");
		change.put("l", "les");
		change.put("n", "anes");
		change.put("ne", "anes");
		change.put("o", "os");
		change.put("r", "res");
		change.put("t", "tas");
		change.put("u", "us");
		change.put("v", "ves");
		change.put("w", "was");
		
		int N = Integer.valueOf(br.readLine());
		while(N-->0) {
			String string = br.readLine();
			int length = string.length();
			String key1 = string.substring(length-1);
			String key2 = string.substring(length-2);
			
			if(change.containsKey(key1)) {
				bw.write(string.substring(0, length-1)+change.get(key1)+"\n");
			} else if(change.containsKey(key2)) {
				bw.write(string.substring(0, length-2)+change.get(key2)+"\n");
			} else {
				bw.write(string+"us\n");
			}
		}

		bw.close();
	} // end of main()
} // end of Main class