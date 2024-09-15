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
		int J = Integer.valueOf(st.nextToken());
		int R = Integer.valueOf(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] sum = new int[J];
		for(int i=0;i<R;i++) {
			for(int j=0;j<J;j++) {
				sum[j] += Integer.valueOf(st.nextToken());
			}
		}
		
		int maxScore=0, idx=0;
		for(int i=0;i<J;i++) {
			if(sum[i]>=maxScore) {
				maxScore=sum[i];
				idx=i+1;
			}
		}
		bw.write(Integer.toString(idx));

		bw.close();
	} // end of main()
} // end of Main class