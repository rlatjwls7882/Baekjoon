import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] fact = new int[11];

	public static void main(String[] args) throws IOException {

		int N = Integer.valueOf(br.readLine());
		
		bw.write(fact(N)+"");

		bw.close();
	} // end of main()
	
	static int fact(int N) {
		if(fact[N]!=0) {
			return fact[N];
		} else {
			fact[0]=fact[1]=1;
			for(int i=2;i<=N;i++) {
				fact[i]=fact[i-1]*i;
			}
			return fact[N];
		}
	} // end of f()
} // end of Main class