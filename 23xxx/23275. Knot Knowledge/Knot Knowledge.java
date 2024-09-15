import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashSet<String> set = new HashSet<>();
		for(int i=0;i<N;i++) {
			set.add(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N-1;i++) {
			set.remove(st.nextToken());
		}
		
		bw.write(set.iterator().next());
		
		bw.close();
	} // end of main()
} // end of Main class