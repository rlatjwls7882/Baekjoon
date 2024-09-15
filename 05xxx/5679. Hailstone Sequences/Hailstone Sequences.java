import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		while(true) {
			int H = Integer.valueOf(br.readLine());
			if(H==0) {
				break;
			}
			
			int max=H;
			while(H!=1) {
				if(H%2==0) {
					H/=2;
				} else {
					H = 3*H+1;
					max = Math.max(max, H);
				}
			}
			bw.write(max+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class