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
		StringTokenizer st;
		
		st = new StringTokenizer(bf.readLine());
		double A1 = Double.valueOf(st.nextToken());
		double P1 = Double.valueOf(st.nextToken());
		st = new StringTokenizer(bf.readLine());
		double R1 = Double.valueOf(st.nextToken());
		double P2 = Double.valueOf(st.nextToken());
		A1/=P1;
		R1=R1*R1*Math.PI/P2;

		if(A1>R1)
			bw.write("Slice of pizza\n");
		else
			bw.write("Whole pizza\n");
		
		bw.close();
	} // end of main
} // end of main class