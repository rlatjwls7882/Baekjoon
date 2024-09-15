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
		
		int t = Integer.valueOf(br.readLine());
		
		for(int i=1;i<=t;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int h = Integer.valueOf(st.nextToken());
			int w = Integer.valueOf(st.nextToken());
			
			char[][] map = new char[h][w];
			for(int j=0;j<h;j++) {
				map[j] = br.readLine().toCharArray();
			}
			
			bw.write("Data Set "+i+":\n");
			for(int j=0;j<w;j++) {
				int firstX=-1;
				for(int k=0;k<h;k++) {
					if(map[k][j]=='X') {
						firstX=k;
						break;
					}
				}
				
				if(firstX==-1) {
					bw.write("N ");
				} else {
					int cost=0;
					for(int k=0;k<firstX;k++) {
						if(map[k][j]=='S') {
							cost+=1;
						} else if(map[k][j]=='H') {
							cost+=3;
						}
					}
					bw.write(cost+" ");
				}
			}
			bw.write("\n\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class