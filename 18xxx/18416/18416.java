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
		
		int N = Integer.valueOf(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int maxL=0, curL=0, beforeVal=0;
		while(N-->0) {
			int curVal = Integer.valueOf(st.nextToken());
			if(curVal>=beforeVal) {
				curL++;
			} else {
				curL=1;
			}
			
			beforeVal=curVal;
			maxL = Math.max(maxL, curL);
		}
		bw.write(Integer.toString(maxL));
		
		bw.close();
	} // end of main()
} // end of Main class