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
		
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		
		if(n-7<1) {
			m+=14;
			if(n==m-28)
				bw.write(n+21+"");
			else if(n==m-29)
				bw.write(n+22+"");
			else if(n==m-30)
				bw.write(n+23+"");
			else
				bw.write(n+24+"");
		}
		else
			bw.write(n-7+"");
		
		bw.close();
	} // end of main
} // end of main class