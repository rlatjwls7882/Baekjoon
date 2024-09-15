import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.HashSet;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BigInteger p = new BigInteger("27");
	public static void main(String[] args) throws IOException {
		
		String string = br.readLine();
		String bin = br.readLine();
		
		boolean[] isGood = new boolean[26];
		for(int i=0;i<26;i++) {
			if(bin.charAt(i)=='1') {
				isGood[i]=true;
			}
		}
		int k = Integer.valueOf(br.readLine());
		
		HashSet<BigInteger> set = new HashSet<>();
		for(int i=0;i<string.length();i++) {
			int bad=0;
			BigInteger powVal = BigInteger.ONE;
			BigInteger hashVal = BigInteger.ZERO;
			for(int j=i;j<string.length();j++) {
				if(!isGood[string.charAt(j)-'a']) bad++;
				if(bad>k) break;
				hashVal = hashVal.add(new BigInteger(Integer.toString(string.charAt(j)-'a'+1)).multiply(powVal));
				powVal = powVal.multiply(p);
				set.add(hashVal);
			}
		}
		bw.write(Integer.toString(set.size()));
		
		bw.close();
	} // end of main
} // end of Main class