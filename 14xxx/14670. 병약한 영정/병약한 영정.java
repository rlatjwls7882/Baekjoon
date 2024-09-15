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

		// 약의 종류 N
		int N = Integer.valueOf(br.readLine());
		
		HashMap<String, String> medicine = new HashMap<>();
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			medicine.put(st.nextToken(), st.nextToken());
		}
		
		// 테스트 케이스의 수 T
		int T = Integer.valueOf(br.readLine());

		while(T-->0) {

			// 증상의 개수 L
			StringTokenizer st = new StringTokenizer(br.readLine());
			int L = Integer.valueOf(st.nextToken());

			// 약을 먹고 살 수 있는지 확인
			StringBuilder sb = new StringBuilder();
			boolean isLive=true;

			while(L-->0) {
				String S = st.nextToken();
				if(medicine.containsKey(S))
					sb.append(medicine.get(S)).append(' ');
				else {
					isLive=false;
					break;
				}
			}

			if(isLive)
				bw.write(sb.toString()+"\n");
			else
				bw.write("YOU DIED\n");
		}

		bw.close();
	} // end of main
} // end of Main class