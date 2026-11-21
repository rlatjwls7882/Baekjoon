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
		int w = Integer.valueOf(st.nextToken());
		int h = Integer.valueOf(st.nextToken());
		
		char[][] img1 = new char[h][w];
		for(int i=0;i<h;i++) {
			img1[i] = br.readLine().toCharArray();
		}
		
		char[][] img2 = new char[h][w];
		for(int i=0;i<h;i++) {
			img2[i] = br.readLine().toCharArray();
		}
		
		String res = br.readLine();
		
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				if(img1[i][j]=='0'&&img2[i][j]=='0') {
					bw.write(res.charAt(0));
				} else if(img1[i][j]=='0') {
					bw.write(res.charAt(1));
				} else if(img1[i][j]=='1'&&img2[i][j]=='0') {
					bw.write(res.charAt(2));
				} else {
					bw.write(res.charAt(3));
				}
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class