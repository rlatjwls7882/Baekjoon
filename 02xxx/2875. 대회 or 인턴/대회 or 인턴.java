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
		int M = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		int teamnum = 0;
		
		while(N>=2&&M>=1) {
			teamnum++;
			N-=2;
			M--;
		}
		
		while(K!=0) {
			if(M>0) {
				M--;
				K--;
			}
			else if(N>0) {
				N--;
				K--;
			}
			else {
				teamnum--;
				M++;
				N+=2;
			}
		}
		
		bw.write(teamnum+"");
		bw.close();
	} // end of main
} // end of main class