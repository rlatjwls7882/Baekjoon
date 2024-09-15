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
		
		int[] card = new int['T'+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int max=0;
		for(int i=0;i<5;i++) {
			int idx = st.nextToken().charAt(0);
			
			if(++card[idx]>max) {
				max=card[idx];
			}
		}
		bw.write(Integer.toString(max));
		
		bw.close();
	} // end of main()
} // end of Main class