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
		
		int n = Integer.valueOf(br.readLine());
		
		while(n-->0) {
			String string = br.readLine();
			int day=0, mon=0, year=0;
			if(string.indexOf('.')!=-1) {
				StringTokenizer st = new StringTokenizer(string, ".");
				day = Integer.valueOf(st.nextToken());
				mon = Integer.valueOf(st.nextToken());
				year = Integer.valueOf(st.nextToken());
			} else {
				StringTokenizer st = new StringTokenizer(string, "/");
				mon = Integer.valueOf(st.nextToken());
				day = Integer.valueOf(st.nextToken());
				year = Integer.valueOf(st.nextToken());
			}
			bw.write(String.format("%02d.%02d.%04d %02d/%02d/%04d\n", day, mon, year, mon, day, year));
		}
		
		bw.close();
	} // end of main()
} // end of Main class