import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.valueOf(st.nextToken());
		int C = Integer.valueOf(st.nextToken());
		
		// 각 팀의 도착지점에서의 거리 계산
		TreeSet<Integer> list = new TreeSet<>();
		int[] team_dist = new int[9];
		
		for(int i=0;i<R;i++) {
			String string = br.readLine();
			for(int j=C-2;j>0;j--) {
				if(string.charAt(j)!='.') {
					team_dist[string.charAt(j)-'1'] = C-2-j;
					list.add(C-2-j);
					break;
				}
			}
		}
		
		// 각 팀의 등수 계산
		int[] rank = new int[9];
		
		while(!list.isEmpty()) {
			int dist = list.pollFirst();
			for(int i=0;i<9;i++) {
				if(dist<=team_dist[i]) {
					rank[i]++;
				}
			}
		}
		
		// 각 팀의 등수 출력
		for(int i=0;i<9;i++) {
			bw.write(Integer.toString(rank[i]));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class