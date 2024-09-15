import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		String string = br.readLine();
		
		Pattern pattern = Pattern.compile("[0-9]+");
		Matcher matcher = pattern.matcher(string);
		
		HashSet<String> set = new HashSet<>();
		while(matcher.find()) {
			set.add(matcher.group());
		}
		bw.write(Integer.toString(set.size()));

		bw.close();
	} // end of main()
} // end of Main class