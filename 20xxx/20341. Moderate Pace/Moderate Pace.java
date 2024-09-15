import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int n = Integer.valueOf(br.readLine());
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		StringTokenizer st3 = new StringTokenizer(br.readLine());
		
		while(n-->0) {
			int[] dist = new int[3];
			dist[0] = Integer.valueOf(st1.nextToken());
			dist[1] = Integer.valueOf(st2.nextToken());
			dist[2] = Integer.valueOf(st3.nextToken());
			Arrays.sort(dist);
			bw.write(dist[1]+" ");
		}
		
		bw.close();
	} // end of main()
} // end of Main class