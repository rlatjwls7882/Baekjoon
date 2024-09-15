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
		
		int P1 = Integer.valueOf(st.nextToken())*3+Integer.valueOf(st.nextToken());
		st = new StringTokenizer(bf.readLine());
		int P2 = Integer.valueOf(st.nextToken())*3+Integer.valueOf(st.nextToken());
		
		if(P1>P2)
			bw.write("1 "+(P1-P2));
		else if(P2>P1)
			bw.write("2 "+(P2-P1));
		else
			bw.write("NO SCORE");
		
		bw.close();
	} // end of main
} // end of main class