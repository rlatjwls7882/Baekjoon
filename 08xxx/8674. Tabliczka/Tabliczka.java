import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		long a = Long.valueOf(st.nextToken());
		long b = Long.valueOf(st.nextToken());
		
		long case1 = Math.abs(a*(b/2)-a*(b-b/2));
		long case2 = Math.abs(b*(a/2)-b*(a-a/2));
		
		if(case1<case2)
			bw.write(case1+"");
		else
			bw.write(case2+"");
		
		bw.close();
	} // end of main
} // end of main class