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
		
		int remove=0;
		for(int i=0;i<3;i++) {
			String string = st.nextToken();
			if(string.equals("tapioka")||string.equals("bubble")) {
				remove++;
			} else {
				bw.write(string+" ");
			}
		}
		if(remove==3) {
			bw.write("nothing");
		}
		
		bw.close();
	} // end of main()
} // end of Main class