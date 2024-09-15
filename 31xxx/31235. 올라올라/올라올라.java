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
		
		int max=1, mink=1, curk=1;
		for(int i=0;i<N;i++) {
			int next = Integer.valueOf(st.nextToken());
			
			if(next>=max) {
				max=next;
				curk=1;
			} else {
				curk++;
				mink = Math.max(mink, curk);
			}
		}
		bw.write(Integer.toString(mink));
		
		bw.close();
	} // end of main()
} // end of Main class