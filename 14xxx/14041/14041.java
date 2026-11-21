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
		
		StringTokenizer st = new StringTokenizer(br.readLine(),":");
		int HH = Integer.valueOf(st.nextToken());
		int MM = Integer.valueOf(st.nextToken());
		
		int remain=120;
		while(remain-->0) {
			if(7<=HH&&HH<10||15<=HH&&HH<19) {
				MM+=2;
			} else {
				MM++;
			}
			
			if(MM==60) {
				MM=0;
				HH++;
				if(HH==24) {
					HH=0;
				}
			}
		}
		bw.write(String.format("%02d:%02d", HH, MM));
		
		bw.close();
	} // end of main()
} // end of Main class