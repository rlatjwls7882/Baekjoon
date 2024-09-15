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
		
		int first0=-1, first1=-1, last0=-1, last1=-1;
		for(int i=0;i<N;i++) {
			if(Integer.valueOf(st.nextToken())==0) {
				if(first0==-1) {
					first0=	i;
				}
				last0=i;
			} else {
				if(first1==-1) {
					first1=i;
				}
				last1=i;
			}
		}
		bw.write(Math.max(Math.abs(last1-first0), Math.abs(last0-first1))+"");
		
		bw.close();
	} // end of main()
} // end of Main class