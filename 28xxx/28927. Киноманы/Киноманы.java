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
		int n1 = Integer.valueOf(st.nextToken())*3+Integer.valueOf(st.nextToken())*20+Integer.valueOf(st.nextToken())*120;
		
		st = new StringTokenizer(bf.readLine());
		int n2 = Integer.valueOf(st.nextToken())*3+Integer.valueOf(st.nextToken())*20+Integer.valueOf(st.nextToken())*120;
		
		if(n1>n2) bw.write("Max");
		else if(n2>n1) bw.write("Mel");
		else bw.write("Draw");
		
		bw.close();
	} // end of main
} // end of main class