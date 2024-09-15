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
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.valueOf(st.nextToken());
			
			double average=0;
			int[] power = new int[N];
			for(int i=0;i<N;i++) {
				power[i] = Integer.valueOf(st.nextToken());
				average += power[i];
			}
			average/=N;
			
			double percent=0;
			for(int i=0;i<N;i++) {
				if(power[i]>average) {
					percent++;
				}
			}
			percent = percent/N*100;
			
			bw.write(String.format("%.03f %.03f%%\n", average, percent));
		}
		
		bw.close();
	} // end of main()
} // end of Main class