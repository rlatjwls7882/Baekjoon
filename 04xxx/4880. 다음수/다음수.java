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
		String string;
		
		while(true) {
			string = bf.readLine();

			if(string.equals("0 0 0")) break;
			
			StringTokenizer st = new StringTokenizer(string);
			int A = Integer.valueOf(st.nextToken());
			int B = Integer.valueOf(st.nextToken());
			int C = Integer.valueOf(st.nextToken());
			
			if(B-A==C-B)
				bw.write("AP "+(C+(C-B)));
			else
				bw.write("GP "+(C*(C/B)));
			
			bw.write("\n");
		} // end of while(true)
		
		bw.close();
	} // end of main
} // end of main class