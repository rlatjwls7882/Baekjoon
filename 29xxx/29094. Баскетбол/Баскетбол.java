import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		while(N-->0) {
			br.readLine();
		}
		
		HashMap<String, Integer> score = new HashMap<>();
		int M = Integer.valueOf(br.readLine());
		int lastScore1=0, lastScore2=0;
		while(M-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), ": ");
			int score1 = Integer.valueOf(st.nextToken());
			int score2 = Integer.valueOf(st.nextToken());
			String name = st.nextToken();
			
			score.put(name, score.getOrDefault(name, 0)+score1+score2-lastScore1-lastScore2);
			lastScore1=score1;
			lastScore2=score2;
		}
		
		ArrayList<String> list = new ArrayList<>(score.keySet());
		list.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return score.get(o2)-score.get(o1);
			}
		});
		bw.write(list.get(0)+" "+score.get(list.get(0)));
		
		bw.close();
	} // end of main()
} // end of Main class