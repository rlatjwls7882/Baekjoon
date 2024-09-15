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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long x1 = Long.valueOf(st.nextToken());
		long y1 = Long.valueOf(st.nextToken());
		long x2 = Long.valueOf(st.nextToken());
		long y2 = Long.valueOf(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		x1 = Math.max(x1, Long.valueOf(st.nextToken()));
		y1 = Math.min(y1, Long.valueOf(st.nextToken()));
		x2 = Math.min(x2, Long.valueOf(st.nextToken()));
		y2 = Math.max(y2, Long.valueOf(st.nextToken()));
		
		if(x2-x1>0&&y1-y2>0) {
			bw.write(Long.toString((x2-x1)*(y1-y2)));
		} else {
			bw.write("0");
		}
		
		bw.close();
	} // end of main()
} // end of Main class