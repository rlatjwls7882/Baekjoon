import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.valueOf(bf.readLine());
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			
			BigInteger lt = BigInteger.valueOf(Long.valueOf(st.nextToken()));
			BigInteger wt = BigInteger.valueOf(Long.valueOf(st.nextToken()));
			BigInteger le = BigInteger.valueOf(Long.valueOf(st.nextToken()));
			BigInteger we = BigInteger.valueOf(Long.valueOf(st.nextToken()));
			
			if(lt.multiply(wt).compareTo(le.multiply(we))>0)
				System.out.println("TelecomParisTech");
			
			else if(lt.multiply(wt).compareTo(le.multiply(we))<0)
				System.out.println("Eurecom");
			
			else
				System.out.println("Tie");
		}
	}
}