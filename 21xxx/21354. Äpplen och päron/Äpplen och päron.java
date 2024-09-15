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
		
		int a = Integer.valueOf(st.nextToken())*7;
		int p = Integer.valueOf(st.nextToken())*13;
		
		if(a>p)
			bw.write("Axel");
		else if(p>a)
			bw.write("Petra");
		else
			bw.write("lika");
		
		bw.close();
	} // end of main
} // end of main class