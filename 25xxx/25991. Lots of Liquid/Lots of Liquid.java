import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st; 
		
		int n = Integer.valueOf(bf.readLine());	
		st = new StringTokenizer(bf.readLine());
		double sum=0;
		
		for(int i=0;i<n;i++) {
			double tmp = Double.valueOf(st.nextToken());
			
			sum += Math.pow(tmp, 3);
		}
		bw.write(Math.pow(sum, 1/3.0)+"");
		bw.close();
	} // end of main
} // end of main class