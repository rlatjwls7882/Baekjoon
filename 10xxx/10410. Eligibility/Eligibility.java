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
		
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " /");
			String name = st.nextToken();
			int startStudy = Integer.valueOf(st.nextToken());
			st.nextToken();
			st.nextToken();
			int born = Integer.valueOf(st.nextToken());
			st.nextToken();
			st.nextToken();
			int courses = Integer.valueOf(st.nextToken());
			
			if(startStudy>=2010||born>=1991) {
				bw.write(name+" eligible\n");
			} else if(courses>=41) {
				bw.write(name+" ineligible\n");
			} else {
				bw.write(name+" coach petitions\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class