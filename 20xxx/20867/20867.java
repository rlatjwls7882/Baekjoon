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
		
		int M = Integer.valueOf(st.nextToken());
		int S = Integer.valueOf(st.nextToken());
		int G = Integer.valueOf(st.nextToken());
		
		st=new StringTokenizer(bf.readLine());
		double A = Double.valueOf(st.nextToken());
		double B = Double.valueOf(st.nextToken());
		
		st=new StringTokenizer(bf.readLine());
		int L = Integer.valueOf(st.nextToken());	
		int R = Integer.valueOf(st.nextToken());	
		
		double walk = M/(double)G + 1/A*L;
		double stand = M/(double)S + 1/B*R;
		
		if(walk<stand)
			bw.write("friskus");
		else
			bw.write("latmask");
		
		bw.close();
	} // end of main
} // end of main class