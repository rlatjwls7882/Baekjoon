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
		String string = st.nextToken();
		int floor = Integer.valueOf(st.nextToken());
		
		if(string.equals("residential")) {
			int[] residential = {1, 5, 10, 15, 20};
			for(int i=0;i<5;i++) {
				if(floor<=residential[i]) {
					bw.write(Integer.toString(i));
					break;
				}
			}
		} else if(string.equals("commercial")) {
			int[] commercial = {1, 7, 14, 20};
			for(int i=0;i<4;i++) {
				if(floor<=commercial[i]) {
					bw.write(Integer.toString(i));
					break;
				}
			}
		} else {
			int[] industrial = {1, 4, 8, 12, 16, 20};
			for(int i=0;i<6;i++) {
				if(floor<=industrial[i]) {
					bw.write(Integer.toString(i));
					break;
				}
			}
		}

		bw.close();
	} // end of main()
} // end of Main class