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
		
		HashSet<Integer> set = new HashSet<>();
		int N = Integer.valueOf(br.readLine());
		
		while(true) {
			if(!set.add(N)) {
				break;
			}
			
			N = N/10%100;
			N = N*N;
		}
		
		bw.write(Integer.toString(set.size()));

		bw.close();
	} // end of main()
} // end of Main class