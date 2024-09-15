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

		// 변환하는 데이터의 종류
		int N = Integer.valueOf(br.readLine());
		HashMap<String, String> change = new HashMap<>();
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			change.put(st.nextToken(), st.nextToken());
		}
		
		// 변환 가능한 데이터만 변환
		int M = Integer.valueOf(br.readLine());
		while(M-->0) {
			String data = br.readLine();
			if(change.containsKey(data))
				bw.write(change.get(data));
			else
				bw.write(data);
		}
		
		bw.close();
	} // end of main
} // end of Main class