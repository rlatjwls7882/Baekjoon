import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		int N = Integer.valueOf(br.readLine());
		
		Set<Integer> set = new HashSet<>();
		int[] A = new int[N+1];
		for(int i=1;i<=N;i++) {
			A[i] = A[i-1]-i;
			if(A[i]<=0 || set.contains(A[i])) {
				A[i] = A[i-1]+i;
			}
			set.add(A[i]);
		}
		bw.write(Integer.toString(A[N]));
		
		bw.close();
	} // end of main
} // end of Main