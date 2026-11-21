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

		int[] road = new int[5];
		for(int i=1;i<5;i++) {
			road[i] = Integer.valueOf(st.nextToken());
		}

		int[][] dist = new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=i-1;j>=0;j--) {
				dist[i][j] = dist[i][j+1]+road[j+1];
			}
			for(int j=i+1;j<5;j++) {
				dist[i][j] = dist[i][j-1]+road[j];
			}
		}

		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				bw.write(dist[i][j]+" ");
			}
			bw.newLine();
		}

		bw.close();
	} // end of main()
} // end of Main class