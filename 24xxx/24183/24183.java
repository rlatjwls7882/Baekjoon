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
		
		double C4 = Double.valueOf(st.nextToken())*229*324*2;
		double A3 = Double.valueOf(st.nextToken())*297*420*2;
		double A4 = Double.valueOf(st.nextToken())*210*297;

		bw.write((C4+A3+A4)/1000000+"");
		bw.close();
	} // end of main
} // end of main class