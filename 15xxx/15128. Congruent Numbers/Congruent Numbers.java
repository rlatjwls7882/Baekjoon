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
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		double p1 = Double.valueOf(st.nextToken());
		double q1 = Double.valueOf(st.nextToken());
		double p2 = Double.valueOf(st.nextToken());
		double q2 = Double.valueOf(st.nextToken());
		
		double area = p1/q1*p2/q2/2;
		
		if(area==Math.floor(area))
			bw.write("1");
		else
			bw.write("0");
		
		bw.close();
	} // end of main
} // end of main class