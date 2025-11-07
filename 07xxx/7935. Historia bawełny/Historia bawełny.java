import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BigInteger[][] comb = new BigInteger[501][501];
	public static void main(String[] args) throws IOException {
		for(int i=0;i<=500;i++) {
			comb[i][0] = comb[i][i] = BigInteger.ONE;
			for(int j=1;j<i;j++) {
				comb[i][j] = comb[i][j-1].multiply(new BigInteger(Integer.toString(i-j+1))).divide(new BigInteger(Integer.toString(j)));
			}
		}
		int t = Integer.valueOf(br.readLine());
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.valueOf(st.nextToken());
			int n = Integer.valueOf(st.nextToken());
			BigInteger g = new BigInteger(st.nextToken());
			
			g = g.subtract(BigInteger.ONE);
			int cur=0, last=1;
			while(cur<m) {
				for(int i=last;i<=n;i++) {
					BigInteger cnt = comb[n-i][m-cur-1];
					if(g.compareTo(cnt)>=0) {
						g = g.subtract(cnt);
					} else {
						bw.write(i+" ");
						last=i+1;
						cur++;
						break;
					}
				}
			}
			bw.write("\n");
		}
        bw.close();
    } // end of main
} // end of Main