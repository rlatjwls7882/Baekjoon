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

		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] num = new int[7];
		for(int i=0;i<7;i++) {
			num[i] = Integer.valueOf(st.nextToken());
		}
		Arrays.sort(num);
		
		int[] ABC = new int[3];
		ABC[0]=num[6]-num[5];
		ABC[1]=num[6]-num[4];
		ABC[2]=num[6]-ABC[0]-ABC[1];
		Arrays.sort(ABC);
		
		bw.write(ABC[0]+" "+ABC[1]+" "+ABC[2]);

		bw.close();
	} // end of main()
} // end of Main class