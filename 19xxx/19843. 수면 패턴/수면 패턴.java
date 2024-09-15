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
		
		HashMap<String, Integer> day = new HashMap<>();
		day.put("Mon", 0);
		day.put("Tue", 24);
		day.put("Wed", 48);
		day.put("Thu", 72);
		day.put("Fri", 96);
		
		// 자야하는 시간 T, 평일에 잠을 잔 횟수 N
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.valueOf(st.nextToken());
		int N = Integer.valueOf(st.nextToken());
		
		// 평일에 잠을 잔 시간 계산
		int time=0;
		while(N-->0) {
			st = new StringTokenizer(br.readLine());
			int start = day.get(st.nextToken()) + Integer.valueOf(st.nextToken());
			int end = day.get(st.nextToken()) + Integer.valueOf(st.nextToken());
			time += end-start;
		}
		
		// 주말에 자야하는 시간 계산
		if(T<=time) {
			bw.write("0");
		} else if(T-time<=48) {
			bw.write(Integer.toString(T-time));
		} else {
			bw.write("-1");
		}
		
		bw.close();
	} // end of main()
} // end of Main class