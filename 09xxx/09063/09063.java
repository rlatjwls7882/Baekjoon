import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.valueOf(bf.readLine());
		int xMax=-10000, yMax=-10000, xMin=10000, yMin=10000;
		
		while(N--!=0) {
			StringTokenizer st = new StringTokenizer(bf.readLine());

			int x = Integer.valueOf(st.nextToken());
			int y = Integer.valueOf(st.nextToken());
			
			if(x>xMax) xMax=x;
			if(y>yMax) yMax=y;
			if(x<xMin) xMin=x;
			if(y<yMin) yMin=y;
		}

		bw.write((xMax-xMin)*(yMax-yMin)+"");
		bw.close();
	} // end of main
} // end of main class