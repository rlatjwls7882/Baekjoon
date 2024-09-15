import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int K = Integer.valueOf(br.readLine());
		for(int i=1;i<=K;i++) {
			int n = Integer.valueOf(br.readLine());
			int[][] RGB = new int[n][3];
			for(int j=0;j<n;j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				RGB[j][0] = Integer.valueOf(st.nextToken());
				RGB[j][1] = Integer.valueOf(st.nextToken());
				RGB[j][2] = Integer.valueOf(st.nextToken());
			}
			
			int max=0;
			ArrayList<String> list = new ArrayList<>();
			for(int j=0;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					int dist = (int)(Math.pow(RGB[j][0]-RGB[k][0], 2)+Math.pow(RGB[j][1]-RGB[k][1], 2)+Math.pow(RGB[j][2]-RGB[k][2], 2));
					if(dist>max) {
						max=dist;
						list = new ArrayList<>();
						list.add(j+1+" "+(k+1));
					} else if(dist==max) {
						list.add(j+1+" "+(k+1));
					}
				}
			}
			bw.write("Data Set "+i+":\n");
			for(String data:list) {
				bw.write(data+"\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class