import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int maxT=0, minT=24*60;
		
		for(int i=0;i<3;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.valueOf(st.nextToken())*60+Integer.valueOf(st.nextToken());
			int end = Integer.valueOf(st.nextToken())*60+Integer.valueOf(st.nextToken());
			
			int time = end-start;
			if(time<0) {
				time += 24*60;
			}
			maxT = Math.max(maxT, time);
			minT = Math.min(minT, time);
		}
		bw.write(String.format("%d:%02d\n", minT/60, minT%60));
		bw.write(String.format("%d:%02d", maxT/60, maxT%60));
		
		bw.close();
	} // end of main()
} // end of Main class