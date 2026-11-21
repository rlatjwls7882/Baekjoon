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
		
		int N = Integer.valueOf(br.readLine());
		
		int maxX=Integer.MIN_VALUE, minX=Integer.MAX_VALUE;
		int maxY=Integer.MIN_VALUE, minY=Integer.MAX_VALUE;
		
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.valueOf(st.nextToken());
			int y = Integer.valueOf(st.nextToken());
			maxX = Math.max(maxX, x);
			maxY = Math.max(maxY, y);
			minX = Math.min(minX, x);
			minY = Math.min(minY, y);
		}
		
		int length = Math.max(maxX-minX, maxY-minY);
		bw.write(Integer.toString(length*length));

		bw.close();
	} // end of main()
} // end of Main class