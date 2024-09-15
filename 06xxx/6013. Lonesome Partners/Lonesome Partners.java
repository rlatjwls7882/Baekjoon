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
		
		int[][] cows = new int[N][2];
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			cows[i][0] = Integer.valueOf(st.nextToken());
			cows[i][1] = Integer.valueOf(st.nextToken());
		}
		
		int maxDist=0;
		int[] pos = new int[2];
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				int dist = calcDist(cows[i], cows[j]);
				if(dist>maxDist) {
					maxDist=dist;
					pos[0]=i+1;
					pos[1]=j+1;
				}
			}
		}
		
		bw.write(pos[0]+" "+pos[1]);

		bw.close();
	} // end of main()
	
	static int calcDist(int[] a, int[] b) {
		return (int)(Math.pow(a[0]-b[0], 2)+Math.pow(a[1]-b[1], 2));
	} // end of calcDist()
} // end of Main class