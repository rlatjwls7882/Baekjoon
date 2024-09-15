import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		
		// [A, B] 구간의 합 계산
		int sum=0, start = (int)(Math.sqrt(2*A+1/4.)-1/2.);
		for(;A<=B;A++) {
			if(start*(start+1)/2<A) {
				start++;
			}
			sum += start;
		}
		
		bw.write(Integer.toString(sum));
		
		bw.close();
	} // end of main()
} // end of Main class