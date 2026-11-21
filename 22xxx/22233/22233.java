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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		HashSet<String> s = new HashSet<>();
		while(N-->0) {
			s.add(br.readLine());
		}
		
		while(M-->0) {
			st = new StringTokenizer(br.readLine(), ",");
			while(st.hasMoreTokens()) {				
				s.remove(st.nextToken());
			}
			bw.write(s.size()+"\n");
		}
		
		bw.close();
	} // end of main
} // end of Main class