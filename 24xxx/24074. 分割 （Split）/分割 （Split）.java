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
		
		int N = Integer.valueOf(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max=0, leftSum=0, rightSum=0;
		
		while(N-->0) {
			int tmp = Integer.valueOf(st.nextToken());
			if(max<tmp) {
				leftSum += max + rightSum;
				rightSum=0;
				max=tmp;
			} else {
				rightSum += tmp;
			}
		}
		bw.write(leftSum+"\n"+rightSum);
		
		bw.close();
	} // end of main()
} // end of Main class