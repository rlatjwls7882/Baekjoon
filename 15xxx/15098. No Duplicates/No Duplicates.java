import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		boolean chk=true;
		HashSet<String> set = new HashSet<>();
		while(st.hasMoreTokens()) {
			if(!set.add(st.nextToken())) {
				chk=false;
				break;
			}
		}
		
		if(chk) {
			bw.write("yes");
		} else {
			bw.write("no");
		}
		
		bw.close();
	} // end of main()
} // end of Main class