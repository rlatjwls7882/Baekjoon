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
		
		// 가장 긴 증가하거나 감소하는 길이 계산
		StringTokenizer st = new StringTokenizer(br.readLine());
		int lastVal = Integer.valueOf(st.nextToken());
		int increasing=1, decreasing=1, max=1;
		
		while(N-->1) {
			int curVal = Integer.valueOf(st.nextToken());
			
			if(curVal>lastVal) {
				increasing++;
				decreasing=1;
			} else if(curVal==lastVal) {
				increasing++;
				decreasing++;
			} else {
				increasing=1;
				decreasing++;
			}
			
			max = Math.max(Math.max(max, increasing), decreasing);
			lastVal=curVal;
		}
		
		bw.write(Integer.toString(max));
		
		bw.close();
	} // end of main()
} // end of Main class