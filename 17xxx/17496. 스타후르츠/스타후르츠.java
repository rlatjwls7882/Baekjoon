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
		
		int N = Integer.valueOf(st.nextToken());
		int T = Integer.valueOf(st.nextToken());
		int C = Integer.valueOf(st.nextToken());
		int P = Integer.valueOf(st.nextToken());
		int num=0;
		
		while(N>0) {
			N-=T;
			num++;
		}
		num--;
		
		bw.write(C*P*num+"");
		bw.close();
	} // end of main
} // end of main class