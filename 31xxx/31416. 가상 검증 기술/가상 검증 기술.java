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
		
		int Q = Integer.valueOf(br.readLine());
		
		while(Q-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int TA = Integer.valueOf(st.nextToken());
			int TB = Integer.valueOf(st.nextToken());
			int VA = Integer.valueOf(st.nextToken());
			int VB = Integer.valueOf(st.nextToken());
			
			int cnt=0;
			for(int time=1;;time++) {
				if(time%TA==0) {
					VA--;
				}
				if(VB==0) {
					if((time-cnt*TB)%TA==0) {
						VA--;
					}
				} else {
					if(time%TB==0) {
						VB--;
						cnt++;
					}
				}
				if(VA<=0&&VB<=0) {
					bw.write(time+"\n");
					break;
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class