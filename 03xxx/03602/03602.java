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
		int b = Integer.valueOf(st.nextToken());
		int w = Integer.valueOf(st.nextToken());
		
		int i=1;
		while(true) {
			int require1 = i*i/2;
			int require2 = i*i-require1;
			
			if(require1<=b&&require2<=w||require1<=w&&require2<=b) {
				i++;
			} else {
				break;
			}
		}
		
		if(i==1) {
			bw.write("Impossible");
		} else {
			bw.write(Integer.toString(i-1));
		}
		
		bw.close();
	} // end of main()
} // end of Main class