import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int t = Integer.valueOf(br.readLine());
		
		while(t-->0) {
			int m = Integer.valueOf(br.readLine());
			
			char[][] map = new char[m][m];
			for(int i=0;i<m;i++) {
				map[i] = br.readLine().toCharArray();
			}
			
			int[] pos1 = new int[2];
			for(int i=0;i<m;i++) {
				for(int j=0;j<m;j++) {
					if(map[i][j]=='s') {
						pos1[0]=i;
						pos1[1]=j;
						i=m;
						break;
					}
				}
			}
			
			double minDist=Double.MAX_VALUE;
			int[] pos2 = new int[2];
			for(int i=0;i<m;i++) {
				for(int j=0;j<m;j++) {
					if(map[i][j]=='p') {
						double dist = Math.sqrt(Math.pow(pos1[0]-i, 2)+Math.pow(pos1[1]-j, 2));
						if(minDist>dist) {
							minDist=dist;
							pos2[0]=i;
							pos2[1]=j;
						}
					}
				}
			}
			bw.write(String.format("(%d,%d):(%d,%d):%.02f\n", pos1[0], pos1[1], pos2[0], pos2[1], minDist));
		}
		
		bw.close();
	} // end of main()
} // end of Main class