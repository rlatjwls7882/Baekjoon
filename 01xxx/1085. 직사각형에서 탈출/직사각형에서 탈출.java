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
		
		int x = Integer.valueOf(st.nextToken());
		int y = Integer.valueOf(st.nextToken());
		int w = Integer.valueOf(st.nextToken());
		int h = Integer.valueOf(st.nextToken());
		int case1, case2;
		
		if(Math.abs(x-w)<Math.abs(y-h))
			case1 = Math.abs(x-w);
		else
			case1 = Math.abs(y-h);

		if(Math.abs(x)<Math.abs(y))
			case2 = Math.abs(x);
		else
			case2 = Math.abs(y);			

		if(case1<case2)
			bw.write(case1+"");
		else
			bw.write(case2+"");
			
		bw.close();
	} // end of main
} // end of main class