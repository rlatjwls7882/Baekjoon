import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int pink = Integer.valueOf(br.readLine());
		int green = Integer.valueOf(br.readLine());
		int red = Integer.valueOf(br.readLine());
		int orange = Integer.valueOf(br.readLine());
		int cost = Integer.valueOf(br.readLine());
		
		int cnt=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;pink*i<=cost;i++) {
			for(int j=0;pink*i+green*j<=cost;j++) {
				for(int k=0;pink*i+green*j+red*k<=cost;k++) {
					if((cost-pink*i-green*j-red*k)%orange==0) {
						cnt++;
						int l = (cost-pink*i-green*j-red*k)/orange;
						min = Math.min(min, i+j+k+l);
						bw.write("# of PINK is "+i+" # of GREEN is "+j+" # of RED is "+k+" # of ORANGE is "+l+"\n");
					}
				}
			}
		}
		bw.write("Total combinations is "+cnt+".\n");
		bw.write("Minimum number of tickets to print is "+min+".");
		
		bw.close();
	} // end of main()
} // end of Main class