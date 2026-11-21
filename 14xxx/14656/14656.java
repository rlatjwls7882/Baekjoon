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

		int N = Integer.valueOf(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int ifBaseball = 0;
		
		for(int i=1;i<=N;i++)			
			if(i!=Integer.valueOf(st.nextToken()))
				ifBaseball++;
		
		bw.write(ifBaseball+"");
		bw.close();
	} // end of main
} // end of main class