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
		int R = Integer.valueOf(st.nextToken());
		
		if(N==R) {
			bw.write("*");
		} else {
			st = new StringTokenizer(br.readLine());
			boolean[] volunteers = new boolean[N];
			while(R-->0) {
				volunteers[Integer.valueOf(st.nextToken())-1]=true;
			}
			
			for(int i=0;i<N;i++) {
				if(!volunteers[i]) {
					bw.write((i+1)+" ");
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class