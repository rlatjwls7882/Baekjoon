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
		int Y = Integer.valueOf(st.nextToken());
		
		HashSet<Integer> obstacles = new HashSet<>();
		for(int i=0;i<Y;i++) {
			obstacles.add(Integer.valueOf(br.readLine()));
		}
		
		int cnt=0;
		for(int i=0;i<N;i++) {
			if(!obstacles.contains(i)) {
				bw.write(i+"\n");
			} else {
				cnt++;
			}
		}
		bw.write("Mario got "+cnt+" of the dangerous obstacles.");
		
		bw.close();
	} // end of main()
} // end of Main class