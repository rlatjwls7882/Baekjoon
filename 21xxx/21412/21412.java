import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int n = Integer.valueOf(br.readLine());
		
		int nominator=0, denominator=0;
		for(int i=1;i<=n/2;i++) {
			if(gcd(i, n-i)==1) {
				nominator=i;
				denominator=n-i;
			}
		}
		bw.write(nominator+" "+denominator);
		
		bw.close();
	} // end of main()
	
	static int gcd(int x, int y) {
		while(y!=0) {
			int tmp=x%y;
			x=y;
			y=tmp;
		}
		return x;
	} // end of gcd()
} // end of Main class