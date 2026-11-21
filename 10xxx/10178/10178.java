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
		
		while(N--!=0) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int c = Integer.valueOf(st.nextToken());
			int v = Integer.valueOf(st.nextToken());
			
			bw.write("You get "+c/v+" piece(s) and your dad gets "
			+c%v+" piece(s).\n");
		}
		
		bw.close();
	} // end of main
} // end of main class