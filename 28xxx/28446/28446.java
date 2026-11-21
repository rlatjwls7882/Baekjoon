import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int M = Integer.valueOf(br.readLine());
		
		// M개의 요청 수행
		HashMap<String, String> ball = new HashMap<>();
		while(M-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			if(st.nextToken().equals("1")) {
				String locker = st.nextToken();
				ball.put(st.nextToken(), locker);
			} else {
				bw.write(ball.get(st.nextToken())+"\n");
			}
		}

		bw.close();
	} // end of main
} // end of Main class