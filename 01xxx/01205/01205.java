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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int TaeWooScore = Integer.valueOf(st.nextToken());
		int P = Integer.valueOf(st.nextToken());
		
		if(N==0) {
			bw.write("1");
		} else {
			st = new StringTokenizer(br.readLine());
			int idx=1, pos=1;
			for(int i=0;i<N;i++) {
				int score = Integer.valueOf(st.nextToken());
				if(score<TaeWooScore) {
					break;
				}
				if(score>TaeWooScore) {
					idx=i+2;
				}
				pos++;
			}
			
			if(pos>P) {
				bw.write("-1");
			} else {
				bw.write(idx+"");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class