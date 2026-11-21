import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.valueOf(br.readLine());
		
		// 가장 쉬운 문제 확인
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String title = st.nextToken();
			treeMap.put(Integer.valueOf(st.nextToken()), title);
		}
		
		bw.write(treeMap.get(treeMap.firstKey())+"");

		bw.close();
	} // end of main
} // end of Main class