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
		
		int j = Integer.valueOf(br.readLine());
		
		HashSet<String> set = new HashSet<>();
		while(j-->0) {
			String string = br.readLine().replace("-", "").toLowerCase();
			set.add(string);
		}
		bw.write(set.size()+"");
		
		bw.close();
	} // end of main()
} // end of Main class