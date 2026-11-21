import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		HashSet<String> hippo = new HashSet<>();
		for(int i=0;i<N;i++) {
			hippo.add(br.readLine());
		}
		bw.write(N-hippo.size()+"");
		
		bw.close();
	} // end of main()
} // end of Main class