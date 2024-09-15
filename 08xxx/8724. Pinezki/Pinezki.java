import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		String string = br.readLine();
		
		int dist=0, maxDist=0;
		for(int i=0;i<N*2;i+=2) {
			if(string.charAt(i)=='1') {
				dist++;
				maxDist = Math.max(maxDist, dist);
			} else {
				dist=0;
			}
		}
		bw.write(Integer.toString(maxDist));

		bw.close();
	} // end of main()
} // end of Main class