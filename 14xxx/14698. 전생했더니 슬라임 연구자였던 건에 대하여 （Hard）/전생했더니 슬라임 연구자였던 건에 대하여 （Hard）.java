import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			int N = Integer.valueOf(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			// 슬라임 합성 비용의 최솟값 계산
			BigInteger cost = BigInteger.ONE;
			PriorityQueue<BigInteger> slime = new PriorityQueue<>();
			while(N-->0) {
				slime.add(new BigInteger(st.nextToken()));
			}
			
			while(slime.size()>1) {
				BigInteger tmp = slime.poll().multiply(slime.poll());
				cost = cost.multiply(tmp);
				slime.add(tmp);
			}
			
			bw.write(cost.remainder(new BigInteger("1000000007")).toString());
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class