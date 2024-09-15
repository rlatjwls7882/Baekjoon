import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// M개의 수의 배수의 합 계산
		st = new StringTokenizer(br.readLine());
		HashSet<Integer> hashSet = new HashSet<>();
		while(M-->0) {
			int K = Integer.valueOf(st.nextToken());
			for(int i=K;i<=N;i+=K)
				hashSet.add(i);
		}
		
		int sum=0;
		Iterator<Integer> it = hashSet.iterator();
		while(it.hasNext())
			sum += it.next();
		
		bw.write(sum+"");
		
		bw.close();
	} // end of main
} // end of Main class