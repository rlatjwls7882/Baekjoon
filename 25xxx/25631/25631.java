import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {

		// 마트료시카의 개수 N
		int N = Integer.valueOf(br.readLine());
		
		// 마트료시카를 잘 합쳤을 때 남아있는 마트료시카의 개수 계산
		HashMap<String, Integer> matryoshca = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max=0;
		
		while(N-->0) {
			String size = st.nextToken();
			matryoshca.put(size, matryoshca.getOrDefault(size, 0)+1);
			if(matryoshca.get(size)>max) max=matryoshca.get(size);
		}
		
		bw.write(max+"");

		bw.close();
	} // end of main()
} // end of Main class