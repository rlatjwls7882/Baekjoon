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
		int C = Integer.valueOf(st.nextToken());
		
		int[] cases = new int[3];
		cases[0] = A+B;
		cases[1] = A-B;
		cases[2] = A*B;

		int min=Integer.MAX_VALUE;
		for(int i=0;i<3;i++) {
			if(cases[i]+C>=0) {
				min = Math.min(min, cases[i]+C);
			}
			if(cases[i]*C>=0) {
				min = Math.min(min, cases[i]*C);
			}
			if(cases[i]-C>=0) {
				min = Math.min(min, cases[i]-C);
			}
			if(cases[i]%C==0&&cases[i]/C>=0) {
				min = Math.min(min, cases[i]/C);
			}
		}
		if(A%B==0) {
			min = Math.min(min, A/B+C);
			min = Math.min(min, A/B*C);
			if(A/B-C>=0) {
				min = Math.min(min, A/B-C);
			}
			if(A/B%C==0&&A/B/C>=0) {
				min = Math.min(min, A/B/C);
			}
		}
		bw.write(min+"");
		
		bw.close();
	} // end of main()
} // end of Main class