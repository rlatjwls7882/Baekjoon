import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int C = Integer.valueOf(st.nextToken());
		int N = Integer.valueOf(st.nextToken());
		
		int[] chickens = new int[C];
		boolean[] check = new boolean[C];
		for(int i=0;i<C;i++) {
			chickens[i] = Integer.valueOf(br.readLine());
		}
		Arrays.sort(chickens);
		
		PriorityQueue<Cow> cows = new PriorityQueue<>();
		while(N-->0) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.valueOf(st.nextToken());
			int B = Integer.valueOf(st.nextToken());
			cows.add(new Cow(A, B));
		}
		
		int cnt=0;
		while(!cows.isEmpty()) {
			Cow curCow = cows.poll();
			for(int i=0;i<C;i++) {
				if(curCow.A<=chickens[i]&&chickens[i]<=curCow.B&&!check[i]) {
					check[i]=true;
					cnt++;
					break;
				}
			}
		}
		bw.write(cnt+"");
		
		bw.close();
	} // end of main()
} // end of Main class

class Cow implements Comparable<Cow> {
	int A, B;
	
	public Cow(int A, int B) {
		this.A=A;
		this.B=B;
	}
	
	@Override
	public int compareTo(Cow o) {
		if(this.B!=o.B) {
			return this.B-o.B;
		}
		return o.A-this.A;
	}
} // end of Cow class