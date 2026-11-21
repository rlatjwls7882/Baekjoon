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
		int l = Integer.valueOf(st.nextToken());
		int w = Integer.valueOf(st.nextToken());
		
		if(l*26<w||w<l) {
			bw.write("impossible");
		} else {
			while(l+26<w) {
				w-=26;
				l--;
				bw.write('z');
			}
			while(l>1) {
				w--;
				l--;
				bw.write('a');
			}
			if(l!=0) {
				bw.write('a'+w-1);
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class