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
		
		String string="";
		
		while(!(string = bf.readLine()).equals("0 0 0")) {
			StringTokenizer st = new StringTokenizer(string);
			int A = Integer.valueOf(st.nextToken());
			int B = Integer.valueOf(st.nextToken());
			int C = Integer.valueOf(st.nextToken());
			if(A>B&&A>C&&A>=B+C)
				bw.write("Invalid\n");
			else if(B>A&&B>C&&B>=A+C)
				bw.write("Invalid\n");
			else if(C>A&&C>B&&C>=A+B)
				bw.write("Invalid\n");
			else if(A==B&&B==C)
				bw.write("Equilateral\n");
			else if(A==B||A==C||B==C)
				bw.write("Isosceles\n");
			else
				bw.write("Scalene\n");
		}
		
		bw.close();
	} // end of main
} // end of main class