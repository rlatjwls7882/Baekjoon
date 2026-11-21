import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 사람들이 만난 기록의 수 N
		int N = Integer.valueOf(br.readLine());
		
		// 무지개 댄스를 추는 사람들 확인
		HashSet<String> dance = new HashSet<String>();
		dance.add("ChongChong");
		
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String A = st.nextToken();
			String B = st.nextToken();
			
			if(dance.contains(A))
				dance.add(B);
			else if(dance.contains(B))
				dance.add(A);
		}
		
		// 무지개 댄스를 추는 사람들의 수 출력
		bw.write(dance.size()+"");
		
		bw.close();
	} // end of main
} // end of Main class