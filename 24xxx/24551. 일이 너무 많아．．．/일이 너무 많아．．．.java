import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static ArrayList<BigInteger> list = new ArrayList<BigInteger>();
	static BigInteger n;
	public static void main(String[] args) throws Exception {
		n = new BigInteger(br.readLine());
		BigInteger v = BigInteger.valueOf(11);
		while(v.compareTo(n)<=0) {
			list.add(v);
			v = v.multiply(BigInteger.TEN).add(BigInteger.ONE);
		}
		bw.write(back(0, 0, BigInteger.ONE).toString());
		bw.close();
	} // end of main
	
	static BigInteger back(int depth, int start, BigInteger cur) {
		BigInteger ret = BigInteger.ZERO;
		if(cur.compareTo(n)>0) return ret;
		if(depth>=1) {
			if(depth%2==1) ret = ret.add(n.divide(cur));
			else ret = ret.subtract(n.divide(cur));
		}
		for(int i=start;i<list.size();i++) {
			ret = ret.add(back(depth+1, i+1, cur.multiply(list.get(i)).divide(cur.gcd(list.get(i)))));
		}
		return ret;
	} // end of back
} // end of Main