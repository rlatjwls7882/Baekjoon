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
		
		int n = Integer.valueOf(st.nextToken())-1;
		int k = Integer.valueOf(st.nextToken())-1;
		int a = Integer.valueOf(st.nextToken());
		int b = Integer.valueOf(st.nextToken());
		
		int elev = (k+n)*b;
		int walk = n*a;
		
		bw.write(elev+" ");
		bw.write(walk+"");
		
		bw.close();
	} // end of main
} // end of main class