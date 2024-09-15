import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {

		BigInteger[] cows = new BigInteger[491];
		cows[1]=cows[2]=BigInteger.ONE;
		int idx=2;
		
		while(true) {
			int x = Integer.valueOf(br.readLine());
			if(x==-1) {
				break;
			}

			if(x>idx) {
				for(int i=idx+1;i<=x;i++) {
					cows[i]=cows[i-1].add(cows[i-2]);
				}
				idx=x;
			}
			bw.write(String.format("Hour %d: %d cow(s) affected\n", x, cows[x]));
		}

		bw.close();
	} // end of main()
} // end of Main class