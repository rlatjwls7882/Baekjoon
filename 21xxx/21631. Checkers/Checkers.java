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
		
		long a = Long.valueOf(st.nextToken())+1;
		long b = Long.valueOf(st.nextToken());
		
		if(a>b)
			bw.write(b+"");
		else
			bw.write(a+"");
		
		bw.close();
	} // end of main
} // end of main class