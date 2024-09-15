import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.valueOf(st.nextToken());
			int M = Integer.valueOf(st.nextToken());
			
			if(N==0&&M==0) {
				break;
			}
			
			// 각 선수의 점수 계산
			TreeMap<Integer, Integer> map = new TreeMap<>();
			for(int i=0;i<N;i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0;j<M;j++) {
					int player = Integer.valueOf(st.nextToken());
					map.put(player, map.getOrDefault(player, 0)+1);
				}
			}
			
			// 2등 출력
			PriorityQueue<Integer> sizes = new PriorityQueue<>(Collections.reverseOrder());
			sizes.addAll(map.values());
			
			sizes.poll();
			int secondPlayerScore = sizes.poll();
			while(!map.isEmpty()) {
				if(map.get(map.firstKey())==secondPlayerScore) {
					bw.write(map.firstKey()+" ");
				}
				map.pollFirstEntry();
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class