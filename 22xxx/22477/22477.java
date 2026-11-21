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
		
		int N = Integer.valueOf(br.readLine());
		
		HashSet<String> card = new HashSet<>();
		while(N-->0) {
			card.add(br.readLine());
		}
		
		int M = Integer.valueOf(br.readLine());
		boolean isOpend=false;
		while(M-->0) {
			String string = br.readLine();
			if(!card.contains(string)) {
				bw.write("Unknown "+string+"\n");
			} else {
				if(isOpend) {
					bw.write("Closed by "+string+"\n");
				} else {
					bw.write("Opened by "+string+"\n");
				}
				isOpend=!isOpend;
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class