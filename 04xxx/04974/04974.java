import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		while(true) {
			int n = Integer.valueOf(br.readLine());
			if(n==0) {
				break;
			}
			
			int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE, sum=0;
			for(int i=0;i<n;i++) {
				int tmp = Integer.valueOf(br.readLine());
				sum += tmp;
				max = Math.max(max, tmp);
				min = Math.min(min, tmp);
			}
			bw.write((sum-max-min)/(n-2)+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class