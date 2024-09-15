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
		
		int t1 = Integer.valueOf(st.nextToken());
		int m1 = Integer.valueOf(st.nextToken());
		int t2 = Integer.valueOf(st.nextToken());
		int m2 = Integer.valueOf(st.nextToken());
		
		int timetomin = t2*60+m2-t1*60-m1;
		
		if(timetomin<0)
			timetomin+=24*60;
		
		bw.write(timetomin+" ");
		bw.write(timetomin/30+"");
		
		bw.close();
	} // end of main
} // end of main class