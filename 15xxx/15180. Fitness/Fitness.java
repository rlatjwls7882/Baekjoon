import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		int S = Integer.valueOf(br.readLine())-1;
		
		int[] station = new int[8];
		station[S]++;
		bw.write((S+1)+" ");
		
		while(true) {
			String string = br.readLine();
			if(string.equals("#")) {
				break;
			}
			
			if(string.charAt(0)=='A') {
				S -= string.charAt(1)-'0';
			} else {
				S += string.charAt(1)-'0';
			}
			S = (S+8)%8;
			station[S]++;
			bw.write((S+1)+" ");
		}
		
		int cnt=0;
		for(int i=0;i<8;i++) {
			if(station[i]==1) {
				cnt++;
			} else if(station[i]==2) {
				cnt=-1;
				break;
			}
		}
		
		if(cnt<5) {
			bw.write("reject");
		}
		
		bw.close();
	} // end of main()
} // end of Main class