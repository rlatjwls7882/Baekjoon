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
		double pa = Double.valueOf(st.nextToken());
		double ka = Double.valueOf(st.nextToken());
		double pb = Double.valueOf(st.nextToken());
		double kb = Double.valueOf(st.nextToken());
		int n = Integer.valueOf(st.nextToken());
		
		int A=0, B=0, cost=0;
		if(Math.ceil(n/ka)*pa<Math.ceil(n/kb)*pb) {
			while(n>0) {
				if(Math.ceil(n/ka)*pa>Math.ceil(n/kb)*pb) {
					int num = (int)Math.ceil(n/kb);
					B += num;
					cost += num*pb;
					break;
				}
				A++;
				cost += pa;
				n -= ka;
			}
		} else {
			while(n>0) {
				if(Math.ceil(n/ka)*pa<Math.ceil(n/kb)*pb) {
					int num = (int)Math.ceil(n/ka);
					A += num;
					cost += num*pa;
					break;
				}
				B++;
				cost += pb;
				n -= kb;
			}
		}
		bw.write(A+" "+B+" "+cost);
		
		bw.close();
	} // end of main()
} // end of Main class