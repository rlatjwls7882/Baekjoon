import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static String next() throws Exception {
		while(st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}
	public static void main(String[] args) throws Exception {
		int n = Integer.valueOf(next());
		String[] s = new String[51];
		BigInteger[][] cost = new BigInteger[n+1][n+1];

		for(int i=1;i<=n;i++) {
			s[i] = next();
			for(int j=1;j<=n;j++) {
				int ch = s[i].charAt(j-1);
				cost[i][j] = BigInteger.valueOf(150-Integer.valueOf(ch)).pow(120).negate();
			}
		}

		Hungarian h = new Hungarian(cost);
		h.res();
		int[] ret = h.getMatching();

		char[] res = new char[n];
		for(int i=1;i<=n;i++) res[i-1] = s[i].charAt(ret[i]-1);
		Arrays.sort(res);

		bw.write(new String(res));
		bw.close();
	}
}

class Hungarian { // O(N^3)
	int n;
	BigInteger[][] cost;
	BigInteger[] row, col, slack;
	int[] matchCol, prevCol;
	boolean[] used;
	static final BigInteger ZERO = BigInteger.ZERO;
	static final BigInteger INF = BigInteger.TEN.pow(300);

	Hungarian(BigInteger[][] cost) {
		this.n = cost.length - 1;
		this.cost = cost;
		row = new BigInteger[n+1];
		col = new BigInteger[n+1];
		slack = new BigInteger[n+1];
		matchCol = new int[n+1];
		prevCol = new int[n+1];
		used = new boolean[n+1];
		Arrays.fill(row, ZERO);
		Arrays.fill(col, ZERO);
		Arrays.fill(slack, ZERO);
	}

	BigInteger res() {
		for(int i=1;i<=n;i++) {
			matchCol[0] = i;
			Arrays.fill(slack, INF);
			Arrays.fill(used, false);

			int j0 = 0;
			do {
				used[j0] = true;
				int i0 = matchCol[j0], j1 = 0;
				BigInteger delta = INF;

				for (int j=1;j<=n;j++) {
					if (!used[j]) {
						BigInteger cur = cost[i0][j].subtract(row[i0]).subtract(col[j]);
						if (cur.compareTo(slack[j])<0) {
							slack[j] = cur;
							prevCol[j] = j0;
						}
						if (slack[j].compareTo(delta)<0) {
							delta = slack[j];
							j1 = j;
						}
					}
				}

				for (int j=0;j<=n;j++) {
					if(used[j]) {
						row[matchCol[j]] = row[matchCol[j]].add(delta);
						col[j] = col[j].subtract(delta);
					} else {
						slack[j] = slack[j].subtract(delta);
					}
				}
				j0 = j1;
			} while(matchCol[j0]!=0);

			do {
				int j1 = prevCol[j0];
				matchCol[j0] = matchCol[j1];
				j0 = j1;
			} while(j0!=0);
		}
		return col[0].negate();
	}
	
	int[] getMatching() {
		int[] ret = new int[n+1];
		for(int j=1;j<=n;j++) ret[matchCol[j]]=j;
		return ret;
	}
}