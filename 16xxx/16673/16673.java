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
		
		int C = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		int P = Integer.valueOf(st.nextToken());
		int wineNum=0;
		
		for(int i=1;i<=C;i++)
			wineNum += K*i+P*i*i;
		
		bw.write(wineNum+"");
		bw.close();
	} // end of main
} // end of main class