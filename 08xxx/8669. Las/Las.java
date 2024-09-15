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

		// 나무의 수 N
		int N = Integer.valueOf(br.readLine());
		
		// 가장 오래된 나무의 수 계산(각 유형마다 한그루씩)
		HashSet<String> oldestTree = new HashSet<>();
		while(N-->0) {
			
			// 나무의 두께와 유형이 공백을 기준으로 입력됨
			StringTokenizer st = new StringTokenizer(br.readLine());
			st.nextToken();
			oldestTree.add(st.nextToken());
		}
		
		bw.write(oldestTree.size()+"");
		
		bw.close();
	} // end of main
} // end of Main class