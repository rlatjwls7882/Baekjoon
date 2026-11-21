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
		double A = Double.valueOf(st.nextToken());
		double B = Double.valueOf(st.nextToken());

		st = new StringTokenizer(bf.readLine());
		double C = Double.valueOf(st.nextToken());
		double D = Double.valueOf(st.nextToken());
		double max=0;
		int num=0;
		
		if(A/C+B/D>max) {
			max = A/C+B/D;
			num=0;
		}
		
		if(C/D+A/B>max) {
			max = C/D+A/B;
			num=1;
		}
		
		if(D/B+C/A>max) {
			max = D/B+C/A;
			num=2;
		}
		
		if(B/A+D/C>max) {
			max = B/A+D/C;
			num=3;
		}
		
		bw.write(num+"");
		bw.close();
	} // end of main
} // end of main class