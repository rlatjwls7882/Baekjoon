import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BigInteger[][] f1 = new BigInteger[401][402];
	static BigInteger[][] f2 = new BigInteger[401][402];
	public static void main(String[] args) throws Exception {
	    f1[0][1]=f2[0][1]=BigInteger.ONE;
	    for(int i=1;i<=400;i++) {
	        BigInteger a=BigInteger.ZERO, b=BigInteger.ONE;
	        for(int j=2;j<=i+1;j++) {
	            f1[i][j]=f1[i-1][j-1].multiply(BigInteger.valueOf(i));
	            f2[i][j]=f2[i-1][j-1].multiply(BigInteger.valueOf(j));
	            
	            BigInteger g = f1[i][j].gcd(f2[i][j]);
	            f1[i][j] = f1[i][j].divide(g);
	            f2[i][j] = f2[i][j].divide(g);
	            
	            BigInteger l = b.multiply(f2[i][j]).divide(b.gcd(f2[i][j]));
	            a = a.multiply(l.divide(b)).add(f1[i][j].multiply(l.divide(f2[i][j])));
	            b = l;
	            
	            g = a.gcd(b);
	            a = a.divide(g);
	            b = b.divide(g);
	        }
	        f1[i][1]=b.subtract(a);
	        f2[i][1]=b;
	    }
	    
	    int p = Integer.valueOf(br.readLine());
	    while(p-->0) {
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	int m = Integer.valueOf(st.nextToken());
	    	int k = Integer.valueOf(st.nextToken());
	    	if(f1[m][k].equals(BigInteger.ZERO)) bw.write("0\n");
	    	else if(f2[m][k].equals(BigInteger.ONE)) bw.write(f1[m][k]+"\n");
	    	else bw.write(f1[m][k]+"/"+f2[m][k]+"\n");
	    }
		bw.close();
	} // end of main
} // end of Main