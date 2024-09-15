import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 닉네임의 수 N
		int N = Integer.valueOf(br.readLine());
		
		// 갓을 붙여 닉네임 출력
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			bw.write("god"); st.nextToken();
			
			while(st.hasMoreTokens())
				bw.write(st.nextToken());
			bw.write("\n");
		}
		
		bw.close();
	} // end of main
} // end of Main class