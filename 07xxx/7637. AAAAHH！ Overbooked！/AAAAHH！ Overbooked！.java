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
		
		while(true) {
			int N = Integer.valueOf(br.readLine());
			if(N==0) {
				break;
			}
			
			boolean[] time = new boolean[2400];
			boolean chk=false;
			while(N-->0) {
				StringTokenizer st = new StringTokenizer(br.readLine(), ":-");
				int start = Integer.valueOf(st.nextToken())*100+Integer.valueOf(st.nextToken());
				int end = Integer.valueOf(st.nextToken())*100+Integer.valueOf(st.nextToken());
				
				if(chk) {
					continue;
				} else {
					while(start<end) {
						if(time[start]) {
							chk=true;
							break;
						}
						time[start]=true;
						start++;
					}
				}
			}
			if(chk) {
				bw.write("conflict\n");
			} else {
				bw.write("no conflict\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class