import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int[] triangle = new int[4];
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] length = new int[3];
			for(int i=0;i<3;i++) {
				length[i] = Integer.valueOf(st.nextToken());
			}
			Arrays.sort(length);
			
			if(length[2]>=length[0]+length[1]) {
				break;
			}
			triangle[0]++;
			if(length[2]*length[2]==length[0]*length[0]+length[1]*length[1]) {
				triangle[1]++;
			} else if(length[2]*length[2]<length[0]*length[0]+length[1]*length[1]) {
				triangle[2]++;
			} else {
				triangle[3]++;
			}
		}
		bw.write(triangle[0]+" "+triangle[1]+" "+triangle[2]+" "+triangle[3]);
		
		bw.close();
	} // end of main()
} // end of Main class