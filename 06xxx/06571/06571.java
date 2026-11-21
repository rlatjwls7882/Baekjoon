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
	public static void main(String[] args) throws IOException {
		
		StringTokenizer st;
		while(true) {			
			st = new StringTokenizer(br.readLine());
			BigInteger a = new BigInteger(st.nextToken());
			BigInteger b = new BigInteger(st.nextToken());
			if(a.compareTo(BigInteger.ZERO)==0 && b.compareTo(BigInteger.ZERO)==0) {
				break;
			}
			
			int cnt=0;
			BigInteger first = BigInteger.ONE;
			BigInteger second = BigInteger.TWO;
			if(first.compareTo(a)>=0 && first.compareTo(b)<=0) cnt++;
			if(second.compareTo(a)>=0 && second.compareTo(b)<=0) cnt++;
			while(true) {
				BigInteger tmp = second;
				second = second.add(first);
				first = tmp;
				if(second.compareTo(b)>0) break;
				if(second.compareTo(a)>=0 && second.compareTo(b)<=0) cnt++;
			}
			bw.write(cnt+"\n");
		}
		
		bw.close();
	} // end of main
} // end of Main class