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
		
		double average=0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		double[] num = new double[10];
		for(int i=0;i<10;i++) {
			num[i] = Double.valueOf(st.nextToken());
			average += num[i];
		}
		average/=10;
		
		double s=0;
		for(int i=0;i<10;i++) {
			s += Math.pow(average-num[i], 2);
		}
		s = Math.sqrt(s/9);
		
		if(s<=1) {
			bw.write("COMFY");
		} else {
			bw.write("NOT COMFY");
		}

		bw.close();
	} // end of main()
} // end of Main class