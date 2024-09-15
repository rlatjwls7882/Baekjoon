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

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// N개의 주소 입력
		HashMap<String, String> address = new HashMap<>();
		while(N-->0) {
			st = new StringTokenizer(br.readLine());
			address.put(st.nextToken(), st.nextToken());
		}
		
		// M개의 주소 검색
		while(M-->0)
			bw.write(address.get(br.readLine())+"\n");
		
		bw.close();
	} // end of main
} // end of Main class