import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.valueOf(br.readLine());
		HashMap<String, Integer> map = new HashMap<>();
		
		// 각 사람의 근무시간 계산
		while(N-->0) {
			
			// 08:00~12:00
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0;i<7;i++) {
				String work = st.nextToken();
				if(!work.equals("-"))
					map.put(work, map.getOrDefault(work, 0)+4);
			}
			
			// 12:00~18:00
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<7;i++) {
				String work = st.nextToken();
				if(!work.equals("-"))
					map.put(work, map.getOrDefault(work, 0)+6);
			}
			
			// 18:00~22:00
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<7;i++) {
				String work = st.nextToken();
				if(!work.equals("-"))
					map.put(work, map.getOrDefault(work, 0)+4);
			}
			
			// 22:00~08:00
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<7;i++) {
				String work = st.nextToken();
				if(!work.equals("-"))
					map.put(work, map.getOrDefault(work, 0)+10);
			}
		}
		
		// 근무표가 공평한지 확인
		int max=0, min=1000000000;
		
		for(int i:map.values()) {
			int workTime = i;
			if(workTime>max) max=workTime;
			if(workTime<min) min=workTime;
		}
		
		bw.write(max-min<=12?"Yes":"No");
		
		bw.close();
	} // end of main
} // end of Main class