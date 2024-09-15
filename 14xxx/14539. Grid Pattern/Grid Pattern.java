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
		
		for(int i=1;i<=N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int row = Integer.valueOf(st.nextToken());
			int col = Integer.valueOf(st.nextToken());
			int w = Integer.valueOf(st.nextToken());
			int h = Integer.valueOf(st.nextToken());
			
			bw.write(String.format("Case #%d:\n", i));
			
			for(int j=0;j<row*(h+1)+1;j++) {
				for(int k=0;k<col*(w+1)+1;k++) {
					if(j%(h+1)==0) {
						if(k%(w+1)==0) {
							bw.write('+');
						} else {
							bw.write('-');
						}
					} else {
						if(k%(w+1)==0) {
							bw.write('|');
						} else {
							bw.write('*');
						}
					}
				}
				bw.newLine();
			}
		}

		bw.close();
	} // end of main()
} // end of Main class