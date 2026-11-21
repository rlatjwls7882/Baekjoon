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
		
		double x=1, y=1;
		
		while(!(x==0&&y==0)) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			x = Double.valueOf(st.nextToken());
			y = Double.valueOf(st.nextToken());
			
			if(x>0&&y>0)
				bw.write("Q1\n");
			else if(x<0&&y>0)
				bw.write("Q2\n");
			else if(x<0&&y<0)
				bw.write("Q3\n");
			else if(x>0&&y<0)
				bw.write("Q4\n");
			else
				bw.write("AXIS\n");
			
		} // end of while
		bw.close();
	} // end of main
} // end of main class