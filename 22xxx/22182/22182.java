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
		int n = Integer.valueOf(st.nextToken());
		int r = Integer.valueOf(st.nextToken());
		double area = r*r*Math.PI;
		
		st = new StringTokenizer(br.readLine());
		double[] a = new double[n];
		double sum=0;
		for(int i=0;i<n;i++) {
			a[i] = Double.valueOf(st.nextToken());
			sum += a[i];
		}
		
		for(int i=0;i<n;i++) {
			bw.write(area*a[i]/sum+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class