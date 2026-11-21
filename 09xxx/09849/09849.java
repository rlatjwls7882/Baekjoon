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
		
		int minX=0, maxX=10000, minY=0, maxY=10000;
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			minX = Math.max(minX, Integer.valueOf(st.nextToken()));
			maxX = Math.min(maxX, Integer.valueOf(st.nextToken()));
			minY = Math.max(minY, Integer.valueOf(st.nextToken()));
			maxY = Math.min(maxY, Integer.valueOf(st.nextToken()));
		}
		
		if(maxX-minX>0&&maxY-minY>0) {
			bw.write(Integer.toString((maxX-minX)*(maxY-minY)));
		} else {
			bw.write("0");
		}
		
		bw.close();
	} // end of main()
} // end of Main class