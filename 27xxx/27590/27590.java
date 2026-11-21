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
		
		int ds = Integer.valueOf(st.nextToken());
		int ys = Integer.valueOf(st.nextToken());
		st = new StringTokenizer(bf.readLine());
		int dm = Integer.valueOf(st.nextToken());
		int ym = Integer.valueOf(st.nextToken());
		
		int nextS = ys-ds;
		int nextM = ym-dm;
		
		while(nextS!=nextM) {
			if(nextS<nextM)
				nextS+=ys;
			else
				nextM+=ym;
		}
		
		bw.write(nextS+"");
		bw.close();
	} // end of main
} // end of main class