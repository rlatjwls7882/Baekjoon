import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		String string = br.readLine();
		int idx1 = string.length()/3;
		int idx2 = idx1*2;
		
		HashSet<String> set = new HashSet<>();
		set.add(string.substring(0, idx1));
		if(set.contains(string.substring(idx1, idx2))) {
			bw.write(string.substring(idx1, idx2));
		} else {
			bw.write(string.substring(idx2));
		}
		
		bw.close();
	} // end of main()
} // end of Main class