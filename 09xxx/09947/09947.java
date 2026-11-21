import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String first = st.nextToken();
			String second = st.nextToken();
			
			if(first.equals("#")&&second.equals("#")) {
				break;
			}
			
			int N = Integer.valueOf(br.readLine());
			
			int score1=0, score2=0;
			while(N-->0) {
				st = new StringTokenizer(br.readLine());
				if(st.nextToken().equals(st.nextToken())) {
					score1++;
				} else {
					score2++;
				}
			}
			
			bw.write(String.format("%s %d %s %d\n", first, score1, second, score2));
		}

		bw.close();
	} // end of main()
} // end of Main class