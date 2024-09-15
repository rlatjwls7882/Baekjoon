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
		for(int i=1;i<=T;i++) {
			bw.write("Recipe # "+i+"\n");
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int R = Integer.valueOf(st.nextToken());
			double P = Double.valueOf(st.nextToken());
			double D = Double.valueOf(st.nextToken());
			
			double mult = D/P;
			String[][] list = new String[R][3];
			for(int j=0;j<R;j++) {
				st = new StringTokenizer(br.readLine());
				for(int k=0;k<3;k++) {
					list[j][k] = st.nextToken();
				}
				if(list[j][2].equals("100.0")) {
					mult *= Double.valueOf(list[j][1])/100;
				}
			}
			
			for(int j=0;j<R;j++) {
				bw.write(String.format("%s %.1f\n", list[j][0], mult*Double.valueOf(list[j][2])));
			}
			bw.write("----------------------------------------\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class