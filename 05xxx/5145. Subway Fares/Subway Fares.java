import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int K = Integer.valueOf(br.readLine());
		
		for(int i=1;i<=K;i++) {
			int n = Integer.valueOf(br.readLine());
			
			int[] cost = new int[n];
			for(int j=1;j<n;j++) {
				cost[j] = Integer.valueOf(br.readLine());
			}
			
			String[] station = new String[n];
			for(int j=0;j<n;j++) {
				station[j] = br.readLine();
			}
			
			String start = br.readLine();
			String end = br.readLine();
			
			int startPos=0, endPos=0;
			for(int j=0;j<n;j++) {
				if(station[j].equals(start)) {
					startPos=j;
				}
				if(station[j].equals(end)) {
					endPos=j;
				}
			}
			bw.write("Data Set "+i+":\n"+cost[Math.abs(endPos-startPos)]+"\n\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class