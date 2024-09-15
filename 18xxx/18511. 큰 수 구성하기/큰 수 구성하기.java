import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static HashSet<Integer> set = new HashSet<>();
	
	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		
		// K개의 원소 입력
		st = new StringTokenizer(br.readLine());
		while(K-->0) {
			set.add(Integer.valueOf(st.nextToken()));
		}
		
		// K의 원소로만 구성된 가장 큰 수 계산
		while(N>0) {
			if(onlyContainsK(N)) {
				break;
			}
			N--;
		}
		
		bw.write(Integer.toString(N));
		
		bw.close();
	} // end of main()
	
	static boolean onlyContainsK(int N) {
		while(N!=0) {
			if(!set.contains(N%10)) {
				return false;
			}
			N/=10;
		}
		
		return true;
	} // end of onlyContainsK()
} // end of Main class